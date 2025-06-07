package com.itau.infra.repository;

import com.itau.application.mapper.SampleMapper;
import com.itau.domain.SampleRepository;
import com.itau.domain.model.Sample;
import com.itau.infra.repository.jpa.SampleJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SampleRepositoryImpl implements SampleRepository {

    private final SampleJpaRepository data;
    private final SampleMapper mapper;

    @Override
    public Sample save(Sample sample) {
        var sampleEntity = data.save(mapper.toEntity(sample));
        return mapper.toDomain(sampleEntity);
    }
}
