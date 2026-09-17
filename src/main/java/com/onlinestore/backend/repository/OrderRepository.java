package com.onlinestore.backend.repository;

import com.onlinestore.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order , Long> {

}
