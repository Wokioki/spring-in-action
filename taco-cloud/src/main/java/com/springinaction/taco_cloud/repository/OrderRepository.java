package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
    extends CrudRepository<TacoOrder, Long> {
}