package com.springboot.parkinglot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.parkinglot.example.model.Products;

@Repository
public interface BakeryShopRepository extends JpaRepository<Products, Long> {

	
}
