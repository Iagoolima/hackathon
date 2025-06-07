package com.itau.application.mapper;

import com.itau.domain.model.Sample;
import com.itau.infra.entity.SampleEntity;
import com.itau.transportlayer.controller.req.CreateSampleReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SampleMapper {

    Sample toDomain(CreateSampleReq createSampleReq);

    Sample toDomain(SampleEntity sampleEntity);

    SampleEntity toEntity(Sample sample);
}
