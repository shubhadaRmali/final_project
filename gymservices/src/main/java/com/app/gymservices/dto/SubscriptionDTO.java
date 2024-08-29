package com.app.gymservices.dto;

import java.sql.Date;

import com.app.gymservices.entity.User;

import jakarta.persistence.Column;

public class SubscriptionDTO {

	private int id;

	@Column
	private int active;

	/*
	 * @Column(name = "customer_id") private int customer_id;
	 * 
	 * @Column(name = "plan_id") private int plan_id;
	 */

	@Column(name = "gym_id")
	private int gym_id;

	@Column(name = "trainer_id")
	private int trainer_id;

	// @Column(name = "start_id")
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private Date start_date;

	// @Column(name = "end_date")
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private Date end_date;

	private int planId;

	// bi-directional many-to-one association to User

	private User userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	/*
	 * public int getCustomer_id() { return customer_id; }
	 * 
	 * public void setCustomer_id(int customer_id) { this.customer_id = customer_id;
	 * }
	 * 
	 * public int getPlan_id() { return plan_id; }
	 * 
	 * public void setPlan_id(int plan_id) { this.plan_id = plan_id; }
	 */

	public int getGym_id() {
		return gym_id;
	}

	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}

	public int getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public User getUser() {
		return userId;
	}

	public void setUser(User userId) {
		this.userId = userId;
	}
}
