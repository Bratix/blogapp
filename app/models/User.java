package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User_table")
public class User {

    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Blog> blogs = new ArrayList<>();

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
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BlogPost> blogPosts = new ArrayList<>();


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
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Comment> comments = new ArrayList<>();

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
    public List<Blog> getBlogs() {
        return blogs;
    }
    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }
    public void setBlogPosts(List<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
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
