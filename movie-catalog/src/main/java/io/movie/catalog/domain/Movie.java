package io.movie.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public record Movie(
        Integer movieId,
        String movieName,
        String category) {
}
