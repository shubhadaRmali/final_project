package com.app.gymservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gymservices.dao.PlanRepository;
import com.app.gymservices.dto.PlanDTO;
import com.app.gymservices.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	public PlanRepository planRepository;

//	@Override
//	public List<Plan> findallplans() {
//		List<Plan> list = new ArrayList<>();
//		list.add(null)
//		
//		return null;
//	}

	@Override
	public List<PlanDTO> findAllplans(int gymId) {

		List<PlanDTO> plandto = new ArrayList<PlanDTO>();
		List<Plan> plan = planRepository.findAllById(gymId);
		if (plan != null && !plan.isEmpty()) {
			plan.forEach(p -> {
				PlanDTO plandt = new PlanDTO();
				plandt.setType(p.getType());
				plandt.setId(p.getId());
				plandt.setDays(p.getDays());
				plandt.setDescription(p.getDescription());
				plandt.setDays(p.getDays());
				plandt.setTrainerId(p.getTrainerId());
				plandt.setName(p.getName());
				plandt.setPrice(p.getPrice());
				plandto.add(plandt);

			});
			return plandto;
		}
		return null;
	}

	@Override
	public Plan findPlanById(int planId) {

		return planRepository.findById(planId).orElse(null);
	}

//	@Override
//	public List<Plan> findallplans() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
