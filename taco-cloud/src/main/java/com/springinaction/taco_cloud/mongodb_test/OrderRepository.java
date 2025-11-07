package com.springinaction.taco_cloud.mongodb_test;

import org.springframework.data.repository.CrudRepository;
import com.springinaction.taco_cloud.mongodb_test.TacoOrder;

public interface OrderRepository
    extends CrudRepository<TacoOrder, String> {
}
