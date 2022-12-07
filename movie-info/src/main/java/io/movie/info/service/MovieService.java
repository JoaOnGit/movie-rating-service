package io.movie.info.service;

import io.movie.info.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    ArrayList<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(Movie.builder().movieId(100).movieName("Black Panther").category("Action").build());
        movies.add(Movie.builder().movieId(101).movieName("Black Adams").category("Action").build());
        movies.add(Movie.builder().movieId(102).movieName("Wednesday").category("Horror").build());
    }

    public List<Movie> listOfMovies(Integer movieId){
        return movies.stream().filter(m -> m.getMovieId().equals(movieId)).collect(Collectors.toList());
    }
}
