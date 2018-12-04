package models;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BlogPost_table")
public class BlogPost {

    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    @Column(name = "dateTime")
    private LocalDateTime creation_date = LocalDateTime.now();

    @Column(name = "post_title")
    private String post_title;

    @Column(name = "post_text")
    private String post_text;

    @Column(name = "tags")
    private String tags;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Blog_id")
    private Blog blog;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "User_id")
    private User user;

    @OneToMany(
            mappedBy = "blogPost",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment){
        comments.add(comment);
        comment.setBlogPost(this);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
        comment.setBlogPost(null);
    }

    //getters,setters,constructors


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getCreation_date() {
        return creation_date;
    }
    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }
    public String getPost_title() {
        return post_title;
    }
    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }
    public String getPost_text() {
        return post_text;
    }
    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public Blog getBlog() {
        return blog;
    }
    public void setBlog(Blog blog) {
        this.blog = blog;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public BlogPost(String post_title, String post_text, String tags) {
        this.post_title = post_title;
        this.post_text = post_text;
        this.tags = tags;
    }
    public BlogPost() {
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", creation_date=" + creation_date +
                ", post_title='" + post_title + '\'' +
                ", post_text='" + post_text + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
