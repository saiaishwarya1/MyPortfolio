package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.repository.ProductRepo;



@RestController
@RequestMapping("pro")
public class ProController {

	@Autowired
	ProductRepo productrepo;

	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepo.save(product);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productrepo.deleteById(id);
	}
	
	@GetMapping("all")
	public List<Product> getAllProduct()
	{
		List<Product> shoe=(List<Product>) productrepo.findAll(); 
		return shoe;
	}
	

	// update existing shoes 
	@PutMapping("update/{id}")
	public Product updateproduct(@RequestBody Product p)
	{
		return productrepo.save(p);
	}
	
	// get particular shoe by ID
		@GetMapping("shoe/{id}")
		public Optional<Product> getProductId(@PathVariable int id)
		{
			return productrepo.findById(id);
		}
		
		// get particular shoe by season
				@GetMapping("shoess/{season}")
				public Optional<Product> getProId(@PathVariable String season)
				{
					return productrepo.findByseason(season);
				}
				
				// get particular shoe by brand
				@GetMapping("shoes/{brand}")
				public Optional<Product> getShoebrand(@PathVariable String brand)
				{
					return productrepo.findBybrand(brand);
				}
				
				@GetMapping("sho/{color}")
				public Optional<Product> getShoecolor(@PathVariable String color)
				{
					return productrepo.findBycolor(color);
				}
				

				@GetMapping("sh/{category}")
				public Optional<Product> getShoecategory(@PathVariable String category)
				{
					return productrepo.findBycategory(category);
				}
				
				@GetMapping("shoed/{createdDate}")
				public Optional<Product> getShoedate(@PathVariable String createdDate)
				{
					return productrepo.findBycreatedDate(createdDate);
				}
				
				
}
