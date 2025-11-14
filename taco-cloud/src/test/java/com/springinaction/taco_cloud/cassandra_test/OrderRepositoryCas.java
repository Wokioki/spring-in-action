package com.springinaction.taco_cloud.cassandra_test;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepositoryCas
        extends CrudRepository<TacoOrderCas, UUID>{
}
