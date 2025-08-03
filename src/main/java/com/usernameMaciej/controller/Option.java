package com.usernameMaciej.controller;

public enum Option {
    ADD_ACTOR(0, "Dodaj Aktora"),
    ADD_MOVIE(1, "Dodaj Film"),
    ADD_TVSERIE(2, "Dodaj Serial"),
    DISPLAY_EVERYTHING(3, "Wyświetl wszystko"),
    END_APPLICATION(4, "Zakończ aplikacje");

    private final int optionNumber;
    private final String description;

    Option(int option, String description) {
        this.optionNumber = option;
        this.description = description;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String optionToChoose() {
        return optionNumber + " - " + description;
    }
}
