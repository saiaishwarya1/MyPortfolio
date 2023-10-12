package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProductModel;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Integer> {

	static void delete(Optional<ProductModel> food) {
		// TODO Auto-generated method stub
		
	}

}
