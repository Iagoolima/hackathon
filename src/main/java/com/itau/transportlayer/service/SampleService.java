package com.itau.transportlayer.service;

import com.itau.domain.model.Sample;
import org.springframework.web.client.RestTemplate;

public class SampleService {

    private final RestTemplate restTemplate;

    public SampleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Sample getSampleFromExternalApi(Long id) {
        String url = "https://api.exemplo.com/samples/" + id;
        return restTemplate.getForObject(url, Sample.class);
    }

}
