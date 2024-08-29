package com.app.gymservices.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_subscription")
// @NamedQuery(name="UserSubscription.findAll", query="SELECT u FROM
// UserSubscription u")
public class UserSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private int active;

	/*
	 * @Column(name = "customer_id") private int customer_id;
	 * 
	 * @Column(name = "plan_id") private int plan_id;
	 */

//	@Column(name = "gym_id")
//	private int gym_id;
	@ManyToOne
	@JoinColumn(name = "trainer_id")
	private User trainer;

	@Column(name = "start_date")
	private Date start_date;

	@Column(name = "end_date")
	private Date end_date;

	@ManyToOne
	@JoinColumn(name = "plan_id")
	private Plan plan;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private User user;

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

	/*
	 * public int getGym_id() { return gym_id; }
	 * 
	 * public void setGym_id(int gym_id) { this.gym_id = gym_id; }
	 */

//	public int getTrainer_id() {
//		return trainer_id;
//	}
//
//	public void setTrainer_id(int trainer_id) {
//		this.trainer_id = trainer_id;
//	}

	public Date getStart_date() {
		return start_date;
	}

	public User getTrainer() {
		return trainer;
	}

	public void setTrainer(User trainer) {
		this.trainer = trainer;
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

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
