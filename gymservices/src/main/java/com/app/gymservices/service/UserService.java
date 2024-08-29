package com.app.gymservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.app.gymservices.dto.UserDTO;
import com.app.gymservices.entity.User;

public interface UserService {

	public List<User> findAllCustomers();

	public ResponseEntity<UserDTO> createUserForRegistration(UserDTO userDto);

	public User getUserFromUserdto(UserDTO userDto);

	public User findUserByUserId(int id);

	public User findUserByTheEmailId(String username);

	public Optional<User> findUserByEmailAndPassword(String email, String password);

	public List<UserDTO> findAllusers(UserDTO userDto);

	// User getUserFromToken(String requestTokenHeader);
}
