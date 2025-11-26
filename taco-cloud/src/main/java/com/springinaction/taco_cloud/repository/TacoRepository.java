package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository
        extends JpaRepository<Taco, Long> {
}
