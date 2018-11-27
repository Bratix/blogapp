package models;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Blog_table")
public class Blog {

    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "blog_title")
    private String blog_title;
    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }
    public String getBlog_title() {
        return blog_title;
    }



    public Blog(String blog_title) {
        this.blog_title = blog_title;
    }

    public Blog() { }
}
