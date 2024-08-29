package com.app.gymservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gymservices.entity.GymDetail;

@Repository
public interface GymDetailRepository extends JpaRepository<GymDetail, Integer> {

}
