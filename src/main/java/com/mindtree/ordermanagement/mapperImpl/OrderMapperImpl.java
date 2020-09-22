package com.mindtree.ordermanagement.mapperImpl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import com.mindtree.ordermanagement.entity.Order;
import com.mindtree.ordermanagement.mapper.OrderMapper;
import com.mindtree.ordermanagement.util.OrderDto;

@Service
public class OrderMapperImpl implements OrderMapper {

	DozerBeanMapper mapper = new DozerBeanMapper();

	@Override
	public Order mapToOrder(OrderDto orderDto) {

		return mapper.map(orderDto, Order.class);
	}

	@Override
	public OrderDto mapToOrderDto(Order order) {

		return mapper.map(order, OrderDto.class);
	}

	@Override
	public List<OrderDto> mapToUserDtoList(List<Order> orderList) {
		List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
		for (Order order : orderList) {
			orderDtoList.add(mapper.map(order, OrderDto.class));
		}
		return orderDtoList;
	}
}
