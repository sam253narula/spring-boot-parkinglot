package com.springboot.parkinglot.example.BakeryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parkinglot.example.model.Products;
import com.springboot.parkinglot.example.service.BakeryService;

@RestController
@RequestMapping("/bakeryShop/")
public class BakeryShopController {
	
	@Autowired
	BakeryService bakeryService;
	
	@GetMapping("/allProducts")
	public List<Products> getAllProducts(){
	return bakeryService.getAllProducts();
	}
	
	@PostMapping("/productsToPurchase")
	public int userWantsToPurchase(@RequestBody List<Products> products){
		return bakeryService.totalBill(products);
	}
	
}
