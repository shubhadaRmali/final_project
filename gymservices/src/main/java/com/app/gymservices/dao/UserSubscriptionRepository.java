package com.app.gymservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gymservices.entity.UserSubscription;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Integer> {

//@Query(value = "select u.gym_id, u.user_phone, s.subscription_type,from users u inner join user_subscription s where u.id=s.customer_id", nativeQuery = true)
	// List<> findAllSubscriptions();

}
