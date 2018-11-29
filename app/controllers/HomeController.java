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

        //creating 2 objects
        Blog blog = new Blog("Amar");
        Blog blog1 = new Blog("Nejra");
        //creating entitymanagerfactory with our persistance unit
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        //creating the entitymanager object
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //begining transaction
        entityManager.getTransaction().begin();
        //persist(save) data to the DB
        entityManager.persist(blog);
        entityManager.persist(blog1);
        //commit transaction
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        //simple query (find is used to search by id)
        //for custom quuers use "entityManager.createQuery("")" where the argument
        //is the querry string
        Blog blog2 = entityManager.find(Blog.class, 1);

        //print to console
        System.out.println(blog2.toString());
        //changing blog2 title
        blog2.setBlog_title("Bratic");
        //commiting the changes of the title to the DB
        entityManager.getTransaction().commit();
        //check to see if the data from Blog_table with id=1 has changed
        blog2 = entityManager.find(Blog.class, 1);
        System.out.println(blog2.toString());


        //entitiymanagerfactory has to be closed after we're done using it
        entityManagerFactory.close();


        return ok(index.render());
    }

}
