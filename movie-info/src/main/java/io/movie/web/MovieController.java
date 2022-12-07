package io.movie.web;

import io.movie.domain.Movie;
import io.movie.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie-catalog")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/v1/{movieId}")
    public List<Movie> moviecatalog(@PathVariable("movieId") Integer id){
        return movieService.listOfMovies(id);
    }


}
