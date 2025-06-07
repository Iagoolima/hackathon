package com.itau.domain;

import com.itau.domain.model.Sample;

public interface SampleRepository {
    Sample save(Sample sample);
}
