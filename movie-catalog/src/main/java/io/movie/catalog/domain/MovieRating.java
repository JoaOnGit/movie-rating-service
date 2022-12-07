package io.movie.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public record MovieRating(
        Integer userId, Integer movieId, Float stars) {
}
