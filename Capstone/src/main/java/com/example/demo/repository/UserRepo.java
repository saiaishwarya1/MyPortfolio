package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.UserModel;

public interface UserRepo extends CrudRepository<UserModel, Integer> {

}
