package com.example.my_shoppe.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "oldprice")
    private String oldprice;

    @Column(name = "newprice")
    private String newprice;

    @Column(name = "image")
    private String image;

    public Category() {
    }

    public Category(Long id, String name, String oldprice, String newprice, String image) {
        this.id = id;
        this.name = name;
        this.oldprice = oldprice;
        this.newprice = newprice;
        this.image = image;
    }

    public Category(String name, String oldprice, String newprice, String image) {
        this.name = name;
        this.oldprice = oldprice;
        this.newprice = newprice;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldprice() {
        return oldprice;
    }

    public void setOldprice(String oldprice) {
        this.oldprice = oldprice;
    }

    public String getNewprice() {
        return newprice;
    }

    public void setNewprice(String newprice) {
        this.newprice = newprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oldprice='" + oldprice + '\'' +
                ", newprice='" + newprice + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
