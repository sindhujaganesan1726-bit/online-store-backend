package com.onlinestore.backend.controller;

import com.onlinestore.backend.entity.Order;
import com.onlinestore.backend.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	
	private final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	@PostMapping
	public Order placeOrder(@RequestBody Order order) {
		return orderService.placeOrder(order);
	}

}
