package com.itau.infra.repository.jpa;

import com.itau.infra.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleJpaRepository extends JpaRepository<SampleEntity, Long> {
}
