package com.usernameMaciej.model;

import com.usernameMaciej.exceptions.GenreNotExistsException;

public enum Genre {
    SCI_FI("Science Fiction"),
    ACTION("Akcja"),
    COMEDY("Komedia"),
    THRILLER("Thriller"),
    ADVENTUROUS("Przygodowy");

    private String description;

    Genre(String pl) {
        this.description = pl;
    }

    public static String convertEnumToString(String genre) {
        Genre[] values = Genre.values();
        for (Genre value : values) {
            if (genre.equalsIgnoreCase(value.description)) {
                return value.description;
            }
        }
        throw new GenreNotExistsException("The provided genre does not exist.");
    }

    public static void printAllGenres() {
        for (Genre value : values()) {
            System.out.println(value.description);
        }
    }
}
