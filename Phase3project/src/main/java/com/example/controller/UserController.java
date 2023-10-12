package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.model.User;
import com.example.repository.UserRepo;

@RestController
@RequestMapping("user")

public class UserController {

  @Autowired
  UserRepo userrepo;
  
	@GetMapping("alluser")
	public List<User> getAllProduct()
	{
		List<User> user=(List<User>) userrepo.findAll(); 
		return user;
	}
		
	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userrepo.deleteById(id);
	}

	@GetMapping("user/{id}")
	public Optional<User> getProductId(@PathVariable int id)
	{
		return userrepo.findById(id);
	}
	

}
