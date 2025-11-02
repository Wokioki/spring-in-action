package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.TacoOrder;
import java.util.Optional;


public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}