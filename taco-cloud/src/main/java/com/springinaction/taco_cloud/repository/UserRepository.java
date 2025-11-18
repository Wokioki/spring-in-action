package com.springinaction.taco_cloud.repository;

import com.springinaction.taco_cloud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
