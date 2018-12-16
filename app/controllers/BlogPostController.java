package controllers;

import models.Blog;
import models.BlogPost;
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
import views.html.blog.post_update;


import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import views.html.blog.blog_update;
import views.html.blog.post_create;

import static java.lang.Integer.parseInt;

public class BlogPostController extends Controller{

    @Inject
    FormFactory formFactory;


    //blogpost create get method
    @Security.Authenticated(Secured.class)
    public Result blogpost_create_get(int id){
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class);
        return ok(post_create.render(blogPostForm,id));
    }

    //blogpost create post method
    @Security.Authenticated(Secured.class)
    public Result blogpost_create_post(int id){
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).bindFromRequest();
        BlogPost blogPost = blogPostForm.get();

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);
        blog.addBlogPost(blogPost);

        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();
        user.addBlogPost(blogPost);

        entityManager.persist(blogPost);

        if(!picture.getFilename().isEmpty() ){
            File file = picture.getFile();
            BufferedImage i = null;
            try{
                i = ImageIO.read(file);

            }catch (IOException e){  }
            String file_path = "media/"+ Integer.toString(blogPost.getId())+"post.jpg";
            File path = new File(System.getProperty("user.dir")+"/public/"+file_path);
            try {
                path.createNewFile();
                ImageIO.write(i, "jpg", path);
                blogPost.setPicture_path(file_path) ;
            }catch (IOException e){
            }
        }

        entityManager.persist(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(blogPost.getId()));
    }




    //blogpost update get method
    @Security.Authenticated(Secured.class)
    public Result blogpost_update_get(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);

        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).fill(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(post_update.render(blogPostForm,blogPost.getId()));
    }


    //blogpost update post method
    @Security.Authenticated(Secured.class)
    public Result blogpost_update_post(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).bindFromRequest();
        BlogPost temp_post = blogPostForm.get();


        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");

        if(!picture.getFilename().isEmpty()){
            File file = picture.getFile();
            BufferedImage i = null;
            try{
                i = ImageIO.read(file);

            }catch (IOException e){  }
            File path = new File(System.getProperty("user.dir")+"/public/"+blogPost.getPicture_path());
            try {
                ImageIO.write(i, "jpg", path);
            }catch (IOException e){
            }
        }

        blogPost.setPost_text(temp_post.getPost_text());
        blogPost.setPost_title(temp_post.getPost_title());
        blogPost.setTags(temp_post.getTags());

        entityManager.persist(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return redirect(routes.HomeController.blogpost_detail(id));
    }

    //blogpost delete
    @Security.Authenticated(Secured.class)
    public Result blogpost_delete(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);

        if(Secured.getName(ctx()).equals(blogPost.getUser().getName())) {
            System.out.println("KAKO JE ");
            entityManager.remove(blogPost);
            File file = new File(System.getProperty("user.dir")+"/public/"+blogPost.getPicture_path());
            file.delete();
        }

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }
}
