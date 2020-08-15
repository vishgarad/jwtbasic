package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repositary.UserRepositary;

@RestController
public class UserController {
	@Autowired
	private UserRepositary repositary;
	
	@GetMapping("/users")
	 List<User> getAllUser()
	 {
		return (List<User>) repositary.findAll();
	 }

}
