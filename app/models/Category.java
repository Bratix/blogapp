package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Category_table")
public class Category {
    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment" )
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @OneToMany(
            mappedBy = "category",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<Blog> blogs = new HashSet<>();

    public void addBlog(Blog blog){
        blogs.add(blog);
        blog.setCategory(this);
    }

    public void removeBlog(Blog blog){
        blogs.remove(blog);
        blog.setCategory(null);
    }

    //getters,setters,constructors


    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
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
    public Set<Blog> getBlogs() {
        return blogs;
    }
    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }
    public Category(String name) {
        this.name = name;
    }
    public Category() {
    }
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}
