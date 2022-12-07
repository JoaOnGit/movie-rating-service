package io.movie.rating.web;

import io.movie.rating.domain.MovieRating;
import io.movie.rating.domain.MovieRatingList;
import io.movie.rating.service.MovieRatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie-rating")
@RequiredArgsConstructor
public class MovieRatingController {
    private final MovieRatingService movieRatingService;

    @GetMapping(path = "/v1/{userId}")
    public MovieRatingList findMovieRating(@PathVariable("userId") Integer userId){
        return movieRatingService.findMovieRating(userId);
    }
}
