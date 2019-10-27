package com.springboot.parkinglot.example.model;

import com.springboot.parkinglot.example.model.Products.ProductsBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Bill {
String item;

}
