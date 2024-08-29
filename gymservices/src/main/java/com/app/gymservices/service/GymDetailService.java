package com.app.gymservices.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.gymservices.dto.GymDetailDTO;
import com.app.gymservices.entity.GymDetail;

public interface GymDetailService {

	GymDetail findGymById(int gymId);

	ResponseEntity<List<GymDetailDTO>> getAllGymdetails();

	ResponseEntity<GymDetailDTO> addgym(GymDetailDTO gymdetailDto);

}
