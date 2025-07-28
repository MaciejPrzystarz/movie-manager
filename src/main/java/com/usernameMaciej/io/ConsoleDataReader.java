package com.usernameMaciej.io;

import com.usernameMaciej.model.Actor;
import com.usernameMaciej.model.Movie;
import com.usernameMaciej.model.TvSeries;

import java.util.Scanner;

public class ConsoleDataReader {


    public Actor createActor() {
        System.out.println("---Dodawanie aktora---");
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj kraj urodzenia:");
        String countryBorn = scanner.nextLine();
        return new Actor(firstName, lastName, countryBorn);
    }

    public Movie createMovie() {
        System.out.println("---Dodawanie filmu---");
        System.out.println("Podaj nazwę:");
        String name = scanner.nextLine();
        System.out.println("Podaj reżysera:");
        String director = scanner.nextLine();
        System.out.println("Podaj rok produkcji:");
        int productionYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj gatunek:");
        String genre = scanner.nextLine();
        System.out.println("Podaj krótki opis:");
        String description = scanner.nextLine();
        System.out.println("Podaj ocenę:");
        double rating = scanner.nextInt();
        scanner.nextLine();
        if (productionYear < 1800 || productionYear > 2026 || rating < 0 || rating > 10) {
            System.out.println("Obiektu nie udało się utworzyć, została przekazana błędna wartość");
            return null;
        }
        return new Movie(name, director, productionYear, genre, description, rating);
    }

    public TvSeries createTvSeries() {
        System.out.println("---Dodawanie filmu---");
        System.out.println("Podaj nazwę:");
        String name = scanner.nextLine();
        System.out.println("Podaj liczbę sezonów");
        int seasonsNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj liczbę odcinków");
        int episodesNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj producenta:");
        String producer = scanner.nextLine();
        System.out.println("Podaj gatunek:");
        String genre = scanner.nextLine();
        System.out.println("Podaj krótki opis:");
        String description = scanner.nextLine();
        System.out.println("Podaj ocenę:");
        double rating = scanner.nextInt();
        scanner.nextLine();
        if (seasonsNumber <= 0 || episodesNumber <= 0 || rating < 0 || rating > 10) {
            System.out.println("Obiektu nie udało się utworzyć, została przekazana błędna wartość");
            return null;
        }
        return new TvSeries(name, seasonsNumber, episodesNumber, producer, genre, description, rating);
    }
}
