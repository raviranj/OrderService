package com.mindtree.ordermanagement.util;

import lombok.Data;

@Data
public class UddateOrderStatusDto {
	private Long orderId;
	private OrderStatus status;
}
