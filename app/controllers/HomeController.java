package controllers;
import models.*;
import org.hibernate.*;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.stat.Statistics;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import scala.Int;
import views.html.*;
import views.html.login.login;
import views.html.login.register;

import javax.inject.Inject;
import javax.naming.NamingException;
import javax.naming.Reference;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    @Inject
    FormFactory formFactory;


    public Result register_get(){
        Form<User> registerForm = formFactory.form(User.class);
        return ok(register.render(registerForm));
    }

    public Result register_post(){
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        User user = userForm.get();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        session().clear();
        session("name", user.getName());
        return redirect(routes.HomeController.index());
    }

    public Result login_get(){
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm));
    }


    public Result login_post(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        Login signin;

        if (loginForm.hasErrors()) {
            return redirect(routes.HomeController.login_get());
        }
        else{
            signin = loginForm.get();
        }


        if(UserLogin.isValid(signin.name,signin.password)) {
            System.out.println(signin.name + signin.password);
            session().clear();
            session("name", loginForm.get().name);
            return redirect(routes.HomeController.index());
        }
        else
            return redirect(routes.HomeController.login_get());

    }


    public Result logout(){
        session().clear();
        return redirect(routes.HomeController.login_get());
    }


    public Result index(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<Blog> blogs = entityManager.createQuery("from Blog").getResultList();
        List<BlogPost> blogPosts = entityManager.createQuery("from BlogPost order by rand()").setMaxResults(5).getResultList();


        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        
        return ok(index.render(blogs, blogPosts));
    }

    @Security.Authenticated(Secured.class)
    public Result blog_detail(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return ok(blog_detail.render(blog));
    }

    @Security.Authenticated(Secured.class)
    public Result category_detail(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<Category> categories = entityManager.createQuery("from Category ",Category.class).getResultList();

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(views.html.categories.render(categories));
    }

    @Security.Authenticated(Secured.class)
    public Result category_posts(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Category category = entityManager.find(Category.class,id);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return ok(category_blogs.render(category));
    }

    @Security.Authenticated(Secured.class)
    public Result blogpost_detail(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);

        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        Form<Comment> commentForm = formFactory.form(Comment.class);
        return ok(blogpost_detail.render(blogPost,commentForm,user));

    }

    @Security.Authenticated(Secured.class)
    public Result tag_search(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String tag = requestData.get("tag");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<BlogPost> blogPosts = entityManager.createQuery("from BlogPost where tags like '%"+tag+"%'").getResultList();


        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(tag_search.render(blogPosts));
    }

    @Security.Authenticated(Secured.class)
    public Result likes(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);
        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();

        if(blogPost.getUsers().contains(user))
            blogPost.removeUsers(user);
        else
            blogPost.addUsers(user);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(id));
    }

}

