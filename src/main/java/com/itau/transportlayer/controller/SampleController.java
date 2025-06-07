package com.itau.transportlayer.controller;

import com.itau.application.mapper.SampleMapper;
import com.itau.domain.model.Sample;
import com.itau.domain.useCase.SampleUseCase;
import com.itau.transportlayer.controller.req.CreateSampleReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sample")
public class SampleController {

    private final SampleUseCase sampleUseCase;
    private final SampleMapper mapper;

    @PostMapping
    public Sample post(@RequestBody CreateSampleReq req) {
        return sampleUseCase.createSample(mapper.toDomain(req));
    }
}
