package com.springinaction.taco_cloud.service;

import com.springinaction.taco_cloud.model.TacoOrder;
import com.springinaction.taco_cloud.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderAdminServiceImpl implements OrderAdminService {

    private final OrderRepository orderRepository;

    public OrderAdminServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void deleteAllOrders() {
        orderRepository.deleteAll();
    }

    @Override
    public Iterable<TacoOrder> findAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}