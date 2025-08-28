package com.usernameMaciej.model;

import java.util.Objects;

public class Movie extends Item {
    private String director;
    private int productionYear;

    public Movie(String name, String genre, String description, double rating, String director, int productionYear) {
        super(name, genre, description, rating);
        this.director = director;
        this.productionYear = productionYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + getName() + '\'' +
                ", Genre='" + getGenre() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                "director='" + director + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
