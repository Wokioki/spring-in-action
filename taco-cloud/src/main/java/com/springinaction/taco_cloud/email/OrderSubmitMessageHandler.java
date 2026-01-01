package com.springinaction.taco_cloud.email;


import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class OrderSubmitMessageHandler extends AbstractMessageHandler {

    @Override
    protected void handleMessageInternal(Message<?> message) {
        System.out.println("[EMAIL FLOW - disabled by default] Received: " + message.getPayload());
    }
}
