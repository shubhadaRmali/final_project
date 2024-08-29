package com.app.gymservices.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.dto.SubscriptionDTO;
import com.app.gymservices.entity.UserSubscription;

public interface UserSubscriptionService {

	public ResponseEntity<UserSubscription> findUserSubscriptionById(int id);

	// ResponseEntity<List<String>> findAllUserSubscriptions();

	ResponseEntity<UserSubscription> addSubscription(SubscriptionDTO subscriptionDTO);

	public ResponseEntity<List<PlanDTO>> findAllUserSubscriptions(int id);

	// public UserSubscription saveUserSubscription(UserSubscription
	// userSubscription);
}
