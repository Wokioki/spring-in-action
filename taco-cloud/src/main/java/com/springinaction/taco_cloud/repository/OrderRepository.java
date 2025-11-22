package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.TacoOrder;
import com.springinaction.taco_cloud.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository
    extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}