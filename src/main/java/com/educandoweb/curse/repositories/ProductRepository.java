package com.educandoweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
