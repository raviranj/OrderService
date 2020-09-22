package com.mindtree.ordermanagement.service;

import java.util.List;
import com.mindtree.ordermanagement.util.OrderDto;
import com.mindtree.ordermanagement.util.OrderStatus;

public interface OrderService {

	public OrderDto findByOrderId(Long orderId);

	public List<OrderDto> findByUserId(Long userId);

	public OrderDto saveOrder(OrderDto orderDto);

	public void updateOrderStatus(Long orderId, OrderStatus status);
}
