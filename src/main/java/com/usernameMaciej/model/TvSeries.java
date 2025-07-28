package com.usernameMaciej.model;

public class TvSeries {
    private String name;
    private int seasonsNumber;
    private int episodesNumber;
    private String producer;
    private String genre;
    private String description;
    private double rating;

    public TvSeries(String name, int seasonsNumber, int episodesNumber, String producer, String genre, String description, double rating) {
        this.name = name;
        this.seasonsNumber = seasonsNumber;
        this.episodesNumber = episodesNumber;
        this.producer = producer;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasonsNumber() {
        return seasonsNumber;
    }

    public void setSeasonsNumber(int seasonsNumber) {
        this.seasonsNumber = seasonsNumber;
    }

    public int getEpisodesNumber() {
        return episodesNumber;
    }

    public void setEpisodesNumber(int episodesNumber) {
        this.episodesNumber = episodesNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


}
