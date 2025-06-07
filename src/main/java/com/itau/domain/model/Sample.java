package com.itau.domain.model;

import lombok.Builder;
import lombok.With;

@With
@Builder(toBuilder = true)
public record Sample(
        Long id,
        String name
) {
}
