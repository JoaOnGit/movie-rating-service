package io.movie.catalog.domain;

public record MovieCatalog(
        Integer movieId,
        String movieName,
        String category,
        Float stars) {
}
