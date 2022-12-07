package io.movie.service;

import io.movie.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    ArrayList<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(Movie.builder().movieId(100).movieName("Black Panther").build());
        movies.add(Movie.builder().movieId(101).movieName("Black Adams").build());
        movies.add(Movie.builder().movieId(102).movieName("Wednesday").build());
    }

    public List<Movie> listOfMovies(Integer movieId){
        return movies.stream().filter(m -> m.getMovieId().equals(movieId)).collect(Collectors.toList());
    }
}
