package models;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


//telling hibernate "hey this is an entity and save it into Blog_table)
@Entity
@Table(name = "Blog_table")
public class Blog {

    //id field which isn't nullable, saved into column named id, and the data is
    //created via incrementation of the highest primary key
    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //blog_title field mapped to the column called blog_title
    @Column(name = "blog_title")
    private String blog_title;

    //getters and setters
    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }
    public String getBlog_title() {
        return blog_title;
    }


    //inicializing constructor
    //we don't have to define an id of the object because the database will crate it for us
    public Blog(String blog_title) {
        this.blog_title = blog_title;
    }

    //default constructor
    public Blog() { }


    //toString method for printing data easily to the console
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blog_title='" + blog_title + '\'' +
                '}';
    }
}
