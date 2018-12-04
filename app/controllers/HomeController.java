package controllers;
import models.*;
import org.hibernate.*;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.stat.Statistics;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import views.html.index;
import views.html.login.login;

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
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    @Inject
    FormFactory formFactory;


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
        List<BlogPost> blogPosts = entityManager.createQuery("from BlogPost order by rand()").setMaxResults(2).getResultList();
        /*User user1 = new User("amar","amaramar");
        User user2 = new User("ilma","ilmailma");

        Category category1 = new Category("gaming");
        Category category2 = new Category("prejaki blogovi");

        Blog blog1 = new Blog("Amarov blog","cool, prekul, prejako itd");
        Blog blog2 = new Blog("Drugi amarov blog","coo2l, prekul2, prejako2 itd2");
        Blog blog3 = new Blog("Ilmin blog", "ilma, ilma, ilma");

        user1.addBlog(blog1);
        user1.addBlog(blog2);
        user2.addBlog(blog3);
        category1.addBlog(blog1);
        category2.addBlog(blog2);
        category2.addBlog(blog3);

        BlogPost blogPost1 = new BlogPost("Amarov prvi blogpost","kako je ovo mocno","mozese da da da");
        BlogPost blogPost2 = new BlogPost("Amarov drugi post","ovo je moj drugi post", "jeste");
        BlogPost blogPost3 = new BlogPost("Ilmin prvi post", "ilma ilma post post post", "moze");

        blog1.addBlogPost(blogPost1);
        blog1.addBlogPost(blogPost2);
        blog3.addBlogPost(blogPost3);
        user1.addBlogPost(blogPost1);
        user1.addBlogPost(blogPost2);
        user2.addBlogPost(blogPost3);



        entityManager.persist(category1);
        entityManager.persist(category2);
        entityManager.persist(user1);
        entityManager.persist(user2);




        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();

        category1 = entityManager.find(Category.class, 2);
        System.out.println(category1.toString());
        for (Blog blog: category1.getBlogs())
        {
            System.out.println(blog);
        }



        entityManager.getTransaction().commit();*/

        entityManagerFactory.close();

        return ok(index.render(blogs, blogPosts));
    }


}
