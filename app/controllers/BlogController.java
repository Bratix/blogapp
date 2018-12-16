package controllers;

import models.Blog;
import models.Category;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import views.html.blog.blog_create;
import views.html.blog.blog_update;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.lang.Integer.parseInt;

public class BlogController extends Controller {

    @Inject
    FormFactory formFactory;

    //blog create get method
    @Security.Authenticated(Secured.class)
    public Result blog_create_get(){
        Form<Blog> blogForm = formFactory.form(Blog.class);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<Category> categories_list = entityManager.createQuery("from Category ").getResultList();
        Seq<Category> categories = JavaConverters.asScalaBuffer(categories_list).toSeq();

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(blog_create.render(blogForm,categories));
    }

    //blog create post method
    @Security.Authenticated(Secured.class)
    public Result blog_create_post(){
        Form<Blog> blogForm = formFactory.form(Blog.class).bindFromRequest();
        Blog blog = blogForm.get();

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();
        Category category = entityManager.createQuery("from Category  where id="+blogForm.field("Category").value(), Category.class).getSingleResult();

        user.addBlog(blog);
        category.addBlog(blog);

        entityManager.persist(blog);


        if(!picture.getFilename().isEmpty()){
            File file = picture.getFile();

            BufferedImage i = null;
            try{
                i = ImageIO.read(file);
            }catch (IOException e){  }
            String file_path = "media/"+ Integer.toString(blog.getId())+"blog.jpg";
            File path = new File(System.getProperty("user.dir")+"/public/"+file_path);
            try {
                path.createNewFile();
                ImageIO.write(i, "jpg", path);
                blog.setPicture_path(file_path) ;
            }catch (IOException e){
            }
        }

        entityManager.persist(blog);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }


    //blog update get method
    @Security.Authenticated(Secured.class)
    public Result blog_update_get(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);
        Form<Blog> blogForm = formFactory.form(Blog.class).fill(blog);
        List<Category> categories_list = entityManager.createQuery("from Category ").getResultList();

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(blog_update.render(blog,blogForm,categories_list));
    }


    //blog update post method
    @Security.Authenticated(Secured.class)
    public Result blog_update_post(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");

        Blog blog = entityManager.find(Blog.class,id);
        Form<Blog> blog_edited = formFactory.form(Blog.class).bindFromRequest();
        Blog temp_blog = blog_edited.get();

        if (parseInt(blog_edited.field("Category").value()) != blog.getCategory().getId()){
            Category category = entityManager.createQuery("from Category  where id="+blog_edited.field("Category").value(), Category.class).getSingleResult();
            blog.setBlog_title(temp_blog.getBlog_title());
            category.addBlog(blog);
        }
        else{
            blog.setBlog_title(temp_blog.getBlog_title());
        }

        if(!picture.getFilename().isEmpty()){
            File file = picture.getFile();
            BufferedImage i = null;
            try{
                i = ImageIO.read(file);

            }catch (IOException e){  }
            File path = new File(System.getProperty("user.dir")+"/public/"+blog.getPicture_path());
            try {
                ImageIO.write(i, "jpg", path);
            }catch (IOException e){
            }
        }

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return redirect(routes.HomeController.blog_detail(id));
    }


    //delete blog
    @Security.Authenticated(Secured.class)
    public Result blog_delete(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);



        if(Secured.getName(ctx()).equals(blog.getUser().getName())) {
            entityManager.remove(blog);
            File file = new File(System.getProperty("user.dir")+"/public/"+blog.getPicture_path());
            file.delete();
        }


        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }
}
