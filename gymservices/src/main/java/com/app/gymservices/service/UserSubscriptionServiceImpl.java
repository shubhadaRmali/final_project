package com.app.gymservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.gymservices.dao.UserSubscriptionRepository;
import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.dto.SubscriptionDTO;
import com.app.gymservices.entity.Plan;
import com.app.gymservices.entity.User;
import com.app.gymservices.entity.UserSubscription;

@Service
public class UserSubscriptionServiceImpl implements UserSubscriptionService {

	@Autowired
	private UserSubscriptionRepository userSubscriptionRepository;

	@Autowired
	private PlanService planservice;

	@Autowired
	private UserService userservice;

	@Override
	public ResponseEntity<UserSubscription> findUserSubscriptionById(int id) {
		return ResponseEntity.ok(userSubscriptionRepository.findById(id).orElse(null));
	}

//	@Override
//	public ResponseEntity<List<String>> findAllUserSubscriptions() {
//		List<String> usersubscribe = userSubscriptionRepository.findAllSubscriptions();
//
//		return ResponseEntity.ok(usersubscribe);
//
//	}

	@Override
	public ResponseEntity<UserSubscription> addSubscription(@RequestBody SubscriptionDTO subscriptionDTO) {
		UserSubscription userSubscription = new UserSubscription();
		// userSubscription.setId(subscriptionDTO.getId());
		userSubscription.setPlan(getPlanfromPlanId(subscriptionDTO.getPlanId()));
		userSubscription.setUser(getUserfromUserId(subscriptionDTO.getId()));
		userSubscription.setStart_date(subscriptionDTO.getStart_date());
		userSubscription.setEnd_date(subscriptionDTO.getEnd_date());
		userSubscription.setTrainer(getUserfromUserId(subscriptionDTO.getId()));

		// subscriptionDTO. savedSubscription = userSubscriptionRepository.save;

		return ResponseEntity.ok(userSubscriptionRepository.save(userSubscription));
	}

	private User getUserfromUserId(int id) {
		// TODO Auto-generated method stub
		return userservice.findUserByUserId(id);
	}

	private Plan getPlanfromPlanId(int planId) {
		// TODO Auto-generated method stub

		return planservice.findPlanById(planId);
	}

	@Override
	public ResponseEntity<List<PlanDTO>> findAllUserSubscriptions(int id) {
		return null;
	}

//	@Override
//	public UserSubscription saveUserSubscription(UserSubscription userSubscription) {
//
//		return null;
//	}

}
