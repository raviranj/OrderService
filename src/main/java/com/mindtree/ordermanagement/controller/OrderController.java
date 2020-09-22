package com.mindtree.ordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ordermanagement.service.OrderService;
import com.mindtree.ordermanagement.util.OrderDto;
import com.mindtree.ordermanagement.util.UddateOrderStatusDto;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping("/findByOrderId/{orderId}")
	public OrderDto findByOrderId(@PathVariable("orderId") Long orderId) {
		return service.findByOrderId(orderId);
	}

	@GetMapping("/findByUserId/{userId}")
	public List<OrderDto> findByUserId(@PathVariable("userId") Long userId) {
		return service.findByUserId(userId);
	}

	@PostMapping("/saveOrder")
	public OrderDto saveOrder(OrderDto orderDto) {
		return service.saveOrder(orderDto);
	}

	@PostMapping("/updateOrderStatus")
	public String updateOrderStatus(UddateOrderStatusDto uddateOrderStatusDto) {
		if (uddateOrderStatusDto.getOrderId() != null)
			service.updateOrderStatus(uddateOrderStatusDto.getOrderId(), uddateOrderStatusDto.getStatus());
		return "Status Updated";
	}
}
