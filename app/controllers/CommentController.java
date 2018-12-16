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
import views.html.blog.comment_update;
import views.html.blog.post_create;
import views.html.blogpost_detail;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CommentController extends Controller{

    @Inject
    FormFactory formFactory;

    //comment create post method
    @Security.Authenticated(Secured.class)
    public Result comment_create_post(int id){
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

    //comment update get method
    @Security.Authenticated(Secured.class)
    public Result comment_update_get(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Comment comment = entityManager.find(Comment.class,id);
        Form<Comment> commentForm = formFactory.form(Comment.class).fill(comment);


        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(comment_update.render(commentForm, comment.getId()));
    }

    //comment update post method
    @Security.Authenticated(Secured.class)
    public Result comment_update_post(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Comment comment = entityManager.find(Comment.class,id);
        Comment temp_comment = formFactory.form(Comment.class).bindFromRequest().get();

        comment.setText(temp_comment.getText());

        entityManager.persist(comment);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(comment.getBlogPost().getId()));
    }

    //comment delete method
    @Security.Authenticated(Secured.class)
    public Result comment_delete(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Comment comment = entityManager.find(Comment.class,id);

        if(Secured.getName(ctx()).equals(comment.getUser().getName()))
        entityManager.remove(comment);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(comment.getBlogPost().getId()));
    }
}
