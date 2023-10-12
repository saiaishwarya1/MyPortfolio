package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepo;





@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/pro")
public class ProductController {

@Autowired
private ProductRepo productRepo;

//List all food items
@GetMapping("all")
public List<ProductModel> getAllProduct()
{
	List<ProductModel> food=(List<ProductModel>) productRepo.findAll(); 
	return food;
}

//Add a food item
/*@PostMapping("add")
public ProductModel addProduct(@RequestBody ProductModel product)
{
	return productRepo.save(product);
}*/

@PostMapping("add")
public ProductModel addProduct(@RequestBody ProductModel product)
{
	return productRepo.save(product);
}

	


//Delete a food item
@DeleteMapping("delete/{id}")
public void deleteProduct(@PathVariable int id)
{
	productRepo.deleteById(id);
}

//delete employee rest api
/*	@DeleteMapping("delete/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteProduct(@PathVariable int id){
		Optional<ProductModel> food = productRepo.findById(id);
				
		
		ProductRepo.delete(food);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}*/

//update existing food items
/*@PutMapping("update/{id}")
public ResponseEntity<ProductModel> updateproduct(@PathVariable int id,@RequestBody ProductModel p)
{
	Optional<ProductModel> product = productRepo.findById(id);
			p.setName(p.getName());
			p.setType(p.getType());
			p.setPrice(p.getPrice());
			ProductModel updatedProduct = productRepo.save(p);
			return ResponseEntity.ok(updatedProduct);
	
}*/

@PutMapping("update/{id}")
public ProductModel updateproduct(@RequestBody ProductModel p)
{
	return productRepo.save(p);
}
}
