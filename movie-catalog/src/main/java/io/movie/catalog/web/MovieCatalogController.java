package io.movie.catalog.web;

import io.movie.catalog.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("movie-catalog")
public class MovieCatalogController {

    //todo: make rest call to movie-info and movie-rating
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path = "/v1/{userId}")
    public MovieCatalogList getMovieCatalog(@PathVariable("userId") Integer userId){
        MovieRatingList movieRatingList = restTemplate.getForObject("http://localhost:8082/movie-rating/v1/"+userId, MovieRatingList.class);
        if(movieRatingList != null)
            return new MovieCatalogList(movieRatingList.movieRatingList().stream().map(m -> {
            Movie movie = restTemplate.getForObject("http://localhost:8081/movie-info/v1/"+m.movieId(), Movie.class);
            return new MovieCatalog(movie.movieId(), movie.movieName(), movie.category(), m.stars());
        }).collect(Collectors.toList()));
        else return null;
    }
}
