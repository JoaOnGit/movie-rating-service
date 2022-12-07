package io.movie.rating.service;

import io.movie.rating.domain.MovieRating;
import io.movie.rating.domain.MovieRatingList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieRatingService {

    List<MovieRating> movieRatings = new ArrayList<>();

    public MovieRatingService() {
        movieRatings.add(MovieRating.builder().userId(1).movieId(100).stars(4.8f).build());
        movieRatings.add(MovieRating.builder().userId(2).movieId(101).stars(4.5F).build());
        movieRatings.add(MovieRating.builder().userId(3).movieId(102).stars(5f).build());
    }

    public MovieRatingList findMovieRating(Integer userId){
        return new MovieRatingList(movieRatings.stream().filter(m -> m.getUserId().equals(userId))
                .collect(Collectors.toList()));
    }
}
