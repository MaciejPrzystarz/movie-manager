package com.usernameMaciej.model;

public class TvSeries extends Item {
    private int seasonsNumber;
    private int episodesNumber;
    private String producer;

    public TvSeries(String name, String genre, String description, double rating, int seasonsNumber,
                    int episodesNumber, String producer) {
        super(name, genre, description, rating);
        this.seasonsNumber = seasonsNumber;
        this.episodesNumber = episodesNumber;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "name='" + getName() + '\'' +
                ", Genre='" + getGenre() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                "seasonsNumber=" + seasonsNumber +
                ", episodesNumber=" + episodesNumber +
                ", producer='" + producer;
    }
}
