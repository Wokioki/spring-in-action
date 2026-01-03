package com.springinaction.taco_cloud.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxSubscribeDemoTest {

    @Test
    void demoSubscribe() {
        Flux<String> fruitFlux = Flux.just(
                "Apple", "Banana", "Orange", "Pear", "Strawberry"
        );

        fruitFlux.subscribe(
                fruit -> System.out.println("Here's some fruit: " + fruit),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed!")
        );
    }
}
