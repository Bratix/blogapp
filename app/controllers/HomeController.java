package controllers;
import com.fasterxml.classmate.AnnotationConfiguration;
import models.Blog;
import org.hibernate.SessionFactory;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;
import views.html.index;
import play.api.Logger;

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


    public Result index() {

        Blog blog = new Blog("Amar");
        Blog blog1 = new Blog("Nejra");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(blog);
        entityManager.persist(blog1);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        Blog blog2 = entityManager.find(Blog.class, 1);
        System.out.println(blog2.toString());
        blog2.setBlog_title("Bratic");
        entityManager.getTransaction().commit();
        blog2 = entityManager.find(Blog.class, 1);
        System.out.println(blog2.toString());


        blog = new Blog("ivan");

        entityManager.getTransaction().begin();
        entityManager.persist(blog);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();


        return ok(index.render());
    }

}
