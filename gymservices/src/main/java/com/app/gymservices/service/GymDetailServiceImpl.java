package com.app.gymservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.gymservices.dao.GymDetailRepository;
import com.app.gymservices.dto.GymDetailDTO;
import com.app.gymservices.entity.GymDetail;

@Service
public class GymDetailServiceImpl implements GymDetailService {

	@Autowired
	private GymDetailRepository gymdetailRepository;

	@Override
	public GymDetail findGymById(int gymId) {
		return gymdetailRepository.findById(gymId).orElse(null);
	}

	@Override
	public ResponseEntity<List<GymDetailDTO>> getAllGymdetails() {
		// TODO Auto-generated method stub

		List<GymDetailDTO> gymDto = new ArrayList<GymDetailDTO>();

		List<GymDetail> gym = gymdetailRepository.findAll();
		if (gym != null && !gym.isEmpty()) {
			gym.forEach(p -> {
				GymDetailDTO gymdt = new GymDetailDTO();
				gymdt.setId(p.getId());
				gymdt.setName(p.getName());

				gymDto.add(gymdt);

			});
			return ResponseEntity.ok(gymDto);

		}
		return null;

	}

	@Override
	public ResponseEntity<GymDetailDTO> addgym(GymDetailDTO gymdetailDto) {

		return null;
	}

}
