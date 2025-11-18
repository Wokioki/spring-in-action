package com.springinaction.taco_cloud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message="Name must be at least 5 characters long")
    private String name;

    @ManyToOne
    @JoinColumn(name = "taco_order")
    private TacoOrder tacoOrder;


    @Size(min = 1, message="You must choose at least 1 ingredient")
    @ManyToMany
    @JoinTable(
            name = "Ingredient_Ref",
            joinColumns = @JoinColumn(name = "taco"),
            inverseJoinColumns = @JoinColumn(name = "ingredient")
    )
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

}
