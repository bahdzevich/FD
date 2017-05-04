package com.foodev.server.entity;

import java.math.BigDecimal;

/**
 * Created by Adrienne on 26.04.17.
 */
public class Dish {
    private int id;
    private String name;
    private String description;
    private int weight;
    private BigDecimal price;
    private Category category;
    private String imageURL;

    public Dish() {
    }

    public Dish(int id, String name, String description, int weight, BigDecimal price, Category category, String imageURL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.category = category;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
