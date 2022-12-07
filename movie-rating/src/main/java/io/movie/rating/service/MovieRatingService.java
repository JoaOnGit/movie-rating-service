package io.movie.rating.service;

import io.movie.rating.domain.MovieRating;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieRatingService {

    List<MovieRating> movieRatings = new ArrayList<>();

    public MovieRatingService() {
        movieRatings.add(MovieRating.builder().movieId(100).stars(4.8f).build());
        movieRatings.add(MovieRating.builder().movieId(101).stars(4.5F).build());
        movieRatings.add(MovieRating.builder().movieId(102).stars(5f).build());
    }

    public List<MovieRating> findMovierating(Integer movieId){
        return movieRatings.stream().filter(m -> m.getMovieId().equals(movieId)).collect(Collectors.toList());
    }
}
