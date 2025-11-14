package com.springinaction.taco_cloud.cassandra_test;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Table("ingredients")
public class IngredCas {
    @PrimaryKey
    private String id;
    private String name;
    private Type type;

    public enum Type { WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE }
}
