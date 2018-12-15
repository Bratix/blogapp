package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "User_table")
public class User {

    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "password")
    private String password;

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private Set<BlogPost> blogPostLiked = new HashSet<>();



    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<Blog> blogs = new HashSet<>();

    public void addBlog(Blog blog){
        blogs.add(blog);
        blog.setUser(this);
    }

    public void removeBlog(Blog blog){
        blogs.remove(blog);
        blog.setUser(null);
    }

    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<BlogPost> blogPosts = new HashSet<>();


    public void addBlogPost(BlogPost blogPost){
        blogPosts.add(blogPost);
        blogPost.setUser(this);
    }

    public void removeBlogPost(BlogPost blogPost){
        blogPosts.remove(blogPost);
        blogPost.setUser(null);
    }

    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<Comment> comments =  new HashSet<>();

    public void addComment(Comment comment){
        comments.add(comment);
        comment.setUser(this);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
        comment.setUser(null);
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<BlogPost> getBlogPostLiked() {
        return blogPostLiked;
    }
    public void setBlogPostLiked(Set<BlogPost> blogPostLiked) {
        this.blogPostLiked = blogPostLiked;
    }
    public Set<Blog> getBlogs() {
        return blogs;
    }
    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }
    public Set<BlogPost> getBlogPosts() {
        return blogPosts;
    }
    public void setBlogPosts(Set<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
    public Set<Comment> getComments() {
        return comments;
    }
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public User() {
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
