package com.educandoweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
