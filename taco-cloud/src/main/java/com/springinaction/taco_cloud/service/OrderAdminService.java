package com.springinaction.taco_cloud.service;

import com.springinaction.taco_cloud.model.TacoOrder;

public interface OrderAdminService {
    void deleteAllOrders();

    Iterable<TacoOrder> findAllOrders();
    void deleteOrderById(Long id);
}