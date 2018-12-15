package controllers;

import models.Blog;
import models.BlogPost;
import models.Category;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import views.html.blog.post_update;


import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import views.html.blog.blog_update;
import views.html.blog.post_create;

import static java.lang.Integer.parseInt;

public class BlogPostController extends Controller{

    @Inject
    FormFactory formFactory;

    @Security.Authenticated(Secured.class)
    public Result blogpost_create(int id){
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class);
        return ok(post_create.render(blogPostForm,id));
    }

    @Security.Authenticated(Secured.class)
    public Result blogpost_save(int id){
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).bindFromRequest();
        BlogPost blogPost = blogPostForm.get();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Blog blog = entityManager.find(Blog.class,id);
        blog.addBlogPost(blogPost);

        User user = entityManager.createQuery("from User where name='"+Secured.getName(ctx())+"'",User.class).getSingleResult();
        user.addBlogPost(blogPost);

        entityManager.persist(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.blogpost_detail(blogPost.getId()));
    }

    @Security.Authenticated(Secured.class)
    public Result blogpost_delete(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);

        entityManager.remove(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result update_blogpost(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);

        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).fill(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return ok(post_update.render(blogPostForm,blogPost.getId()));
    }

    @Security.Authenticated(Secured.class)
    public Result save_blogpost_update(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        BlogPost blogPost = entityManager.find(BlogPost.class,id);
        Form<BlogPost> blogPostForm = formFactory.form(BlogPost.class).bindFromRequest();
        BlogPost temp_post = blogPostForm.get();

        blogPost.setPost_text(temp_post.getPost_text());
        blogPost.setPost_title(temp_post.getPost_title());
        blogPost.setTags(temp_post.getTags());

        entityManager.persist(blogPost);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return redirect(routes.HomeController.blogpost_detail(id));
    }
}
