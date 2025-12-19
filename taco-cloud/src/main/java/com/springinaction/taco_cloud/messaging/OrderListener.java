package com.springinaction.taco_cloud.messaging;

import com.springinaction.taco_cloud.model.TacoOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    private KitchenUI ui;

    @Autowired
    public OrderListener(KitchenUI ui) {
        this.ui = ui;
    }

    @KafkaListener(topics="orders.topic")
    public void handle(TacoOrder order) {
        ui.displayOrder(order);
    }

}
