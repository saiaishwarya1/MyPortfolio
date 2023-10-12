package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

	Optional<Product> findByseason(String season);

	Optional<Product> findBybrand(String brand);

	Optional<Product> findBycolor(String color);

	Optional<Product> findBycategory(String category);

	Optional<Product> findByprice(String price);

	Optional<Product> findBycreatedDate(String createdDate);

	
	

	
}
