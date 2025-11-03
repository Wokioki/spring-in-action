package com.springinaction.taco_cloud.repository;


import com.springinaction.taco_cloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
    extends CrudRepository<Ingredient, String> {

}
