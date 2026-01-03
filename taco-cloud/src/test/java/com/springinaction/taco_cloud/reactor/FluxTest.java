package com.springinaction.taco_cloud.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import org.junit.jupiter.api.Test;

public class FluxTest {

    @Test
    public void testFruitFlux(){
        Flux<String> fruitFlux = Flux.just(
                "Apple", "Orange", "Grape", "Banana", "Strawberry"
        );


        StepVerifier.create(fruitFlux)
                .expectNext("Apple")
                .expectNext("Orange")
                .expectNext("Grape")
                .expectNext("Banana")
                .expectNext("Strawberry")
                .verifyComplete();
    }

}
