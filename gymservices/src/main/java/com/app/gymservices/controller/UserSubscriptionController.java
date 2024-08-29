package com.app.gymservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.dto.SubscriptionDTO;
import com.app.gymservices.entity.UserSubscription;
import com.app.gymservices.service.UserSubscriptionService;

@CrossOrigin
@RestController
@RequestMapping("/usersubscriptions")
public class UserSubscriptionController {

	@Autowired
	public UserSubscriptionService usersubscriptionservice;

	@GetMapping("/{id}")
	public ResponseEntity<UserSubscription> findUserSubscriptionById(@PathVariable int id) {
		return usersubscriptionservice.findUserSubscriptionById(id);
	}

	@GetMapping("/get")
	public ResponseEntity<List<PlanDTO>> findAllUserSubscriptions(@PathVariable int id) {
		return usersubscriptionservice.findAllUserSubscriptions(id);
	}

	@PostMapping("/add")
	public ResponseEntity<UserSubscription> addSubscription(@RequestBody SubscriptionDTO subscriptionDto) {

		return usersubscriptionservice.addSubscription(subscriptionDto);

	}

}
