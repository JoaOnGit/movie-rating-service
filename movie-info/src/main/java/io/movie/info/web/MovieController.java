package io.movie.info.web;

import io.movie.info.domain.Movie;
import io.movie.info.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie-info")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/v1/{movieId}")
    public Movie moviecatalog(@PathVariable("movieId") Integer id){
        return movieService.listOfMovies(id);
    }


}
