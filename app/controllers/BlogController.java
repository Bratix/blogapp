package controllers;

import models.Blog;
import models.Category;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import scala.collection.Seq;
import views.html.blog.blog_create;
import scala.collection.JavaConverters;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import scala.collection.JavaConverters;
import java.util.Optional;

public class BlogController extends Controller {

    @Inject
    FormFactory formFactory;


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

        entityManager.persist(user);
        entityManager.persist(category);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }
}
