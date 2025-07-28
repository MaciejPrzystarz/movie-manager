package com.usernameMaciej.db;

import com.usernameMaciej.io.ConsoleDataReader;
import com.usernameMaciej.model.Actor;
import com.usernameMaciej.model.Movie;
import com.usernameMaciej.model.TvSeries;

public class AppDatabase {
    private Actor[] actors = new Actor[5];
    private int actorsNumber = 0;
    private Movie[] movies = new Movie[5];
    private int moviesNumber = 0;
    private TvSeries[] tvSeries = new TvSeries[5];
    private int tvSeriesNumber = 0;

    public Actor[] getActors() {
        return actors;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public TvSeries[] getTvSeries() {
        return tvSeries;
    }

    public void addActor(Actor actor) {
        if (actors != null && actorsNumber < actors.length) {
            actors[actorsNumber] = actor;
            actorsNumber++;
        }
    }

    public void addMovie(Movie movie) {
        if (movies != null && moviesNumber < movies.length) {
            movies[moviesNumber] = movie;
            moviesNumber++;
        }
    }

    public void addTvSerie(TvSeries tvSerie) {
        if (tvSeries != null && tvSeriesNumber < tvSeries.length) {
            tvSeries[tvSeriesNumber] = tvSerie;
            tvSeriesNumber++;
        }
    }
}
