package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {
}
