package com.educandoweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
