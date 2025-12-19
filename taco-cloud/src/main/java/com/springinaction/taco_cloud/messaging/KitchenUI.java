package com.springinaction.taco_cloud.messaging;

import com.springinaction.taco_cloud.model.TacoOrder;
import org.springframework.stereotype.Component;

@Component
public class KitchenUI {

    public void displayOrder(TacoOrder order) {
        System.out.println("Kitchen received order: " + order);
    }

}
