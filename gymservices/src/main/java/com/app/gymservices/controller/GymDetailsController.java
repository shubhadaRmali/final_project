package com.app.gymservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gymservices.dto.GymDetailDTO;
import com.app.gymservices.service.GymDetailService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class GymDetailsController {

	@Autowired
	public GymDetailService gymdetailservice;

	@GetMapping("/gym")
	public ResponseEntity<List<GymDetailDTO>> getGymDetails() {

		return gymdetailservice.getAllGymdetails();
	}

	@PostMapping("/addgym")
	public ResponseEntity<GymDetailDTO> addGymDetails(@RequestBody GymDetailDTO gymdetailDto) {

		return gymdetailservice.addgym(gymdetailDto);
	}
}
