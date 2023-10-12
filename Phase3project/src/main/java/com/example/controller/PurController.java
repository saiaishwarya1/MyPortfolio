package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Purchase;
import com.example.repository.PurchaseRepo;



@RestController
@RequestMapping("pur")
public class PurController {


	@Autowired
	PurchaseRepo purchaserepo;
	
	@GetMapping("allpur")
	public List<Purchase> getAllPurchase()
	{
		List<Purchase> shoepur=(List<Purchase>) purchaserepo.findAll(); 
		return shoepur;
	}
	}


