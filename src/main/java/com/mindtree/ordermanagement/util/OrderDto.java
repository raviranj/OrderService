package com.mindtree.ordermanagement.util;

import java.util.Date;
import java.util.List;


import lombok.Data;

@Data
public class OrderDto {

	public Long orderId;
    private  Long userId;
    private String paymentType;
    private OrderStatus orderStatus;
    private double totalCost;
    private String note;
    private int estimatedTimeInMinutes;
    private int offerInPercentage;
	public Long restaurantId;
    private String restaurantName;
	public Long deliveryPersonId;
	public List<OrderDishDetailDto> orderDishDetailList;
    private Date creationTime;
    private Date lastModifyTime;
}
