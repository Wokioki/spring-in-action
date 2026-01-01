package com.springinaction.taco_cloud.email;

import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.stereotype.Component;

@Component
public class EmailToOrderTransformer extends AbstractTransformer {

    @Override
    protected Object doTransform(Object payload) {
        return payload;
    }
}
