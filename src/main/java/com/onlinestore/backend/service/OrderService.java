package com.onlinestore.backend.service;

import com.onlinestore.backend.entity.Order;
import com.onlinestore.backend.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	public Order placeOrder(Order order) {
		return orderRepository.save(order);
	}
}
