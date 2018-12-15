package controllers;

import models.Blog;
import models.Category;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import views.html.blog.blog_create;
import views.html.blog.blog_update;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static java.lang.Integer.parseInt;

public class BlogController extends Controller {

    @Inject
    FormFactory formFactory;


    @Security.Authenticated(Secured.class)
    public Result create_Blog(){
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

    @Security.Authenticated(Secured.class)
    public Result save_Blog(){
        Form<Blog> blogForm = formFactory.form(Blog.class).bindFromRequest();
        Blog blog = blogForm.get();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();
        Category category = entityManager.createQuery("from Category  where id="+blogForm.field("Category").value(), Category.class).getSingleResult();

        user.addBlog(blog);
        category.addBlog(blog);

        entityManager.persist(blog);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result update_blog(int id){
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

    @Security.Authenticated(Secured.class)
    public Result update_save(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);
        Form<Blog> blog_edited = formFactory.form(Blog.class).bindFromRequest();
        Blog temp_blog = blog_edited.get();

        if (parseInt(blog_edited.field("Category").value()) != blog.getCategory().getId()){
            Category category = entityManager.createQuery("from Category  where id="+blog_edited.field("Category").value(), Category.class).getSingleResult();
            blog.setBlog_title(temp_blog.getBlog_title());
            blog.setTags(temp_blog.getTags());
            category.addBlog(blog);
        }
        else{
            blog.setBlog_title(temp_blog.getBlog_title());
            blog.setTags(temp_blog.getTags());
        }

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return redirect(routes.HomeController.blog_detail(id));
    }

    @Security.Authenticated(Secured.class)
    public Result delete_blog(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);

        entityManager.remove(blog);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }
}
