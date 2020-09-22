package com.mindtree.ordermanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mindtree.ordermanagement.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {

	@Query("SELECT o from Order o where o.userId= :userId")
	List<Order> findByUserId(@Param(value = "userId") Long userId);
}
