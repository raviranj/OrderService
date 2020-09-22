package com.mindtree.ordermanagement.mapper;

import java.util.List;
import com.mindtree.ordermanagement.entity.Order;
import com.mindtree.ordermanagement.util.OrderDto;

public interface OrderMapper {

	public Order mapToOrder(OrderDto orderDto);

	public OrderDto mapToOrderDto(Order order);

	public List<OrderDto> mapToUserDtoList(List<Order> orderList);
}
