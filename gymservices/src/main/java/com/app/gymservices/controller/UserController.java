package com.app.gymservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.gymservices.dto.UserDTO;
import com.app.gymservices.entity.User;
import com.app.gymservices.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	public UserService userservice;

	/*
	 * @GetMapping("/hello")
	 * 
	 * @ResponseBody public String sayHello() { return "Hello, World!"; }
	 */

	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<UserDTO> addAllRegisteredUser(@RequestBody UserDTO userDto) {
		System.out.println("employee " + userDto.toString());
		return userservice.createUserForRegistration(userDto);
	}

	@GetMapping
	public List<User> findAll() {
		return userservice.findAllCustomers();
	}

	@PostMapping("/login")
	@ResponseBody
	public User findTheUserByEmailId(@RequestBody UserDTO userDto) {
		System.out.println("employee " + userDto.toString());
		return userservice.findUserByTheEmailId(userDto.getEmail());
	}

	@GetMapping("/list")
	public List<UserDTO> findAllusers(@RequestBody UserDTO userDto) {
		return userservice.findAllusers(userDto);
	}
}
