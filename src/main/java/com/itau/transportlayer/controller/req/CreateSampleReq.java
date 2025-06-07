package com.itau.transportlayer.controller.req;

import lombok.Builder;
import lombok.With;

@With
@Builder(toBuilder = true)
public record CreateSampleReq(
        String name
) {
}

