package com.usernameMaciej.model;

public class Item {
    private String name;
    private String genre;
    private String description;
    private double rating;

    public Item(String name, String genre, String description, double rating) {
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }
}
