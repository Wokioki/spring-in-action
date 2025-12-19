package com.springinaction.taco_cloud.messaging;

import com.springinaction.taco_cloud.model.TacoOrder;

public interface OrderMessagingService {
    void sendOrder(TacoOrder order);
}
