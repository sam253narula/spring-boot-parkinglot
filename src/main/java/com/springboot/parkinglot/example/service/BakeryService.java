package com.springboot.parkinglot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parkinglot.example.model.Products;
import com.springboot.parkinglot.example.repository.BakeryShopRepository;

@Service
public class BakeryService {
	
	@Autowired
	BakeryShopRepository bakeryShopRepository;
	
	public List<Products> getAllProducts() {
		return bakeryShopRepository.findAll();
	}
	
	public int totalBill(List<Products> products) {
		int price =0;
		for(Products product : products) {
			price = price +	product.getPrice();
		}
		return price;
	}

}
