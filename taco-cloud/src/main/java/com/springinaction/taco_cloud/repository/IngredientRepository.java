package com.springinaction.taco_cloud.repository;


import com.springinaction.taco_cloud.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
