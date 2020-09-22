package com.mindtree.ordermanagement.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.mindtree.ordermanagement.util.OrderStatus;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "order_detail")
@Getter
@Setter
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderId")
	private Long orderId;

	@Column(name = "userId")
    private  Long userId;
    
	@Column(name = "paymentType")
    private String paymentType;
	
	 @Enumerated(EnumType.STRING)
	 @Column(name = "orderStatus", length = 8)
    private OrderStatus orderStatus;
    
	@Column(name = "totalCost")
    private double totalCost;
	
	@Column(name = "note")
    private String note;
    
	@Column(name = "estimatedTimeInMinutes")
    private int estimatedTimeInMinutes;
	
	@Column(name = "offerInPercentage")
    private int offerInPercentage;
	
	@Column(name = "restaurantId")
	private Long restaurantId;
	
	@Column(name = "restaurantName")
    private String restaurantName;
	
	@Column(name = "deliveryPersonId")
	private Long deliveryPersonId;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	private List<OrderDishDetail> orderDishDetailList= new ArrayList<OrderDishDetail>();
     
    @CreatedDate
    private Date creationTime;
    @LastModifiedDate
    private Date lastModifyTime;
}
