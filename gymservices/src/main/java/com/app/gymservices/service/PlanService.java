package com.app.gymservices.service;

import java.util.List;

import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.entity.Plan;

public interface PlanService {

	// public List<Plan> findallplans();

	List<PlanDTO> findAllplans(int gymId);

	Plan findPlanById(int planId);
}
