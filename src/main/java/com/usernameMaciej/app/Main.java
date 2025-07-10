package com.usernameMaciej.app;

import com.usernameMaciej.io.ConsoleDataReader;
import com.usernameMaciej.model.Actor;
import com.usernameMaciej.model.Movie;
import com.usernameMaciej.model.TvSeries;

public class Main {
    public static void main(String[] args) {
        ConsoleDataReader consoleDataReader = new ConsoleDataReader();
        Actor actor = consoleDataReader.createActor();
        Movie movie = consoleDataReader.createMovie();
        TvSeries tvSeries = consoleDataReader.createTvSeries();
        System.out.println(actor);
        System.out.println(movie);
        System.out.println(tvSeries);

    }
}
