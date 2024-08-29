package com.app.gymservices.dto;

import java.math.BigDecimal;

import com.app.gymservices.entity.GymDetail;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PlanDTO {

	private int id;

	private int active;

	private int days;

	private String description;

	private int duration;

	private int trainerId;

	private String name;

	private BigDecimal price;

	private int type;

	// bi-directional many-to-one association to GymDetail
	@ManyToOne
	@JoinColumn(name = "gym_id")
	private GymDetail gymDetail;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getDays() {
		return this.days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	/*
	 * public int getIsTrainer() { return this.isTrainer; }
	 * 
	 * public void setIsTrainer(int isTrainer) { this.isTrainer = isTrainer; }
	 */

	public String getName() {
		return this.name;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public GymDetail getGymDetail() {
		return this.gymDetail;
	}

	public void setGymDetail(GymDetail gymDetail) {
		this.gymDetail = gymDetail;
	}

}
