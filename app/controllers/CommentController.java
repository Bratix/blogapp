package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import views.html.blog.blog_create;
import views.html.blog.blog_update;
import views.html.blog.post_create;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CommentController extends Controller{

    @Inject
    FormFactory formFactory;

    @Security.Authenticated(Secured.class)
    public Result comment_save(int id){
        Form<Comment> commentForm = formFactory.form(Comment.class).bindFromRequest();
        Comment comment = commentForm.get();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class, id);
        blogPost.addComment(comment);

        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();
        user.addComment(comment);

        entityManager.persist(comment);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(id));
    }
}
