package models;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Blog_table")
public class Blog {


    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    @Column(name = "picture_path")
    private String picture_path;

    @Column(name = "blog_title")
    private String blog_title;

    @Column(name = "dateTime")
    private LocalDateTime creation_date = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "User_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Category_id")
    private Category category;

    @OneToMany(
            mappedBy = "blog",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<BlogPost> blogPosts = new HashSet<>();

    public void addBlogPost(BlogPost blogPost){
        blogPosts.add(blogPost);
        blogPost.setBlog(this);
    }

    public void removeBlogPost(BlogPost blogPost){
        blogPosts.remove(blogPost);
        blogPost.setBlog(null);
    }

    //getters,setters,constructors

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPicture_path() {
        return picture_path;
    }
    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }
    public String getBlog_title() {
        return blog_title;
    }
    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }
    public LocalDateTime getCreation_date() {
        return creation_date;
    }
    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Set<BlogPost> getBlogPosts() {
        return blogPosts;
    }
    public void setBlogPosts(Set<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
    public Blog(String blog_title) {
        this.blog_title = blog_title;
    }
    public Blog() {
    }
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blog_title='" + blog_title + '\'' +
                ", creation_date=" + creation_date +
                ", category" + category.getName() + '\'' +
                '}';
    }
}
