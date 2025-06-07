package com.itau.domain.useCase;

import com.itau.domain.SampleRepository;
import com.itau.domain.model.Sample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleUseCase {

    private final SampleRepository repository;

    public Sample createSample(Sample sample) {
        return repository.save(sample);
    }
}
