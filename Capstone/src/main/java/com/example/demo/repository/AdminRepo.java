package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.AdminModel;

public interface AdminRepo extends CrudRepository<AdminModel,Integer> {

}
