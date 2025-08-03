package com.usernameMaciej.controller;

import com.usernameMaciej.db.AppDatabase;
import com.usernameMaciej.io.ConsoleDataReader;
import com.usernameMaciej.model.Actor;
import com.usernameMaciej.model.Movie;
import com.usernameMaciej.model.TvSeries;

import java.util.Scanner;

public class AppController {
    private final Scanner scanner = new Scanner(System.in);
    private ConsoleDataReader consoleDataReader = new ConsoleDataReader();
    private AppDatabase appDatabase = new AppDatabase();

    public void mainLoop() {
        boolean flag = true;
        do {
            displayOptions();
            System.out.println("Wybierz opcję:");
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 0 -> addActor();
                case 1 -> addMovie();
                case 2 -> addTvSerie();
                case 3 -> displayEverything();
                case 4 -> flag = false;
                default -> System.out.println("Zły numer.");
            }
        } while (flag);
    }

    private void displayEverything() {
        for (Actor actor : appDatabase.getActors()) {
            if (actor != null)
                System.out.println(actor);
        }
        for (Movie movie : appDatabase.getMovies()) {
            if (movie != null)
                System.out.println(movie);
        }
        for (TvSeries tvserie : appDatabase.getTvSeries()) {
            if (tvserie != null)
                System.out.println(tvserie);
        }
    }

    private void addActor() {
        Actor actor = consoleDataReader.createActor();
        appDatabase.addActor(actor);
    }

    private void addMovie() {
        Movie movie = consoleDataReader.createMovie();
        appDatabase.addMovie(movie);
    }

    private void addTvSerie() {
        TvSeries tvSerie = consoleDataReader.createTvSeries();
        appDatabase.addTvSerie(tvSerie);
    }

    private void displayOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value.optionToChoose());
        }
    }
}
