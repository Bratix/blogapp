package models;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Blog_table")
public class Blog {


    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

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

    @Column(name = "tags")
    private String tags;

    @OneToMany(
            mappedBy = "blog",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BlogPost> blogPosts = new ArrayList<>();

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
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }
    public void setBlogPosts(List<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
    public Blog(String blog_title, String tags) {
        this.blog_title = blog_title;
        this.tags = tags;
    }
    public Blog() {
    }
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blog_title='" + blog_title + '\'' +
                ", creation_date=" + creation_date +
                ", tags='" + tags + '\'' +
                ", category" + category.getName() + '\'' +
                '}';
    }
}
