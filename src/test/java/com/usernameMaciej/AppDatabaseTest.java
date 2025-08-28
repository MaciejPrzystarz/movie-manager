package com.usernameMaciej;

import com.usernameMaciej.db.AppDatabase;
import org.junit.jupiter.api.Test;
import com.usernameMaciej.exceptions.DuplicateException;
import com.usernameMaciej.model.Actor;
import com.usernameMaciej.model.Movie;
import com.usernameMaciej.model.TvSeries;

import static org.assertj.core.api.Assertions.*;
public class AppDatabaseTest {
    private final AppDatabase db = new AppDatabase();

    @Test
    void shouldAddActorSuccessfully() {
        Actor actor = new Actor("Tom", "Hanks", "USA");

        db.addActor(actor);

        assertThat(db.getActors()[0]).isEqualTo(actor);
    }

    @Test
    void shouldThrowExceptionWhenAddingDuplicateActor() {
        Actor actor = new Actor("Tom", "Hanks", "USA");

        db.addActor(actor);

        assertThatThrownBy(() -> db.addActor(actor))
                .isInstanceOf(DuplicateException.class)
                .hasMessageContaining("Actor cannot be duplicated.");
    }

    @Test
    void shouldAddMovieSuccessfully() {
        Movie movie = new Movie("Inception", "Sci-Fi", "Dreams within dreams", 10, "Nolan", 2010);

        db.addMovie(movie);

        assertThat(db.getMovies()[0]).isEqualTo(movie);
    }

    @Test
    void shouldAddTvSeriesSuccessfully() {
        TvSeries series = new TvSeries("Breaking Bad", "Crime", "Chemistry teacher turns criminal", 10, 5, 62, "Vince Gilligan");

        db.addTvSerie(series);

        assertThat(db.getTvSeries()[0]).isEqualTo(series);
    }

    @Test
    void shouldThrowExceptionWhenAddingDuplicateTvSeries() {
        TvSeries series = new TvSeries("Breaking Bad", "Crime", "Chemistry teacher turns criminal", 10, 5, 62, "Vince Gilligan");

        db.addTvSerie(series);

        assertThatThrownBy(() -> db.addTvSerie(series))
                .isInstanceOf(DuplicateException.class)
                .hasMessageContaining("TV Series cannot be duplicated.");
    }
}
