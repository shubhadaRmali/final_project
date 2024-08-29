package com.app.gymservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.gymservices.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {

	@Query(value = "select * from Plan a where a.gym_id= :gymId", nativeQuery = true)
	List<Plan> findAllById(int gymId);

}
