package com.app.gymservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.service.PlanService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class PlanController {

	@Autowired
	public PlanService planservice;

	@GetMapping("/plan/{gymId}")
	public List<PlanDTO> findAllplans(@PathVariable int gymId) {
		return planservice.findAllplans(gymId);
	}

}
