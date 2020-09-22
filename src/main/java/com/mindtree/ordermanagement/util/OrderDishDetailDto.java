package com.mindtree.ordermanagement.util;

import lombok.Data;

@Data
public class OrderDishDetailDto {

	public Long id;
	public Long dishId;
	public Long quantity;
	public double price;
	private Long order;
}