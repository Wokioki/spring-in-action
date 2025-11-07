package com.springinaction.taco_cloud.mongodb_test;

import org.springframework.data.repository.CrudRepository;
import com.springinaction.taco_cloud.mongodb_test.Ingredient;

public interface IngridientRepository
    extends CrudRepository<Ingredient, String > {
}
