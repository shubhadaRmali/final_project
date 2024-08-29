package com.app.gymservices.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * The persistent class for the gym_details database table.
 * 
 */
@Entity
@Table(name = "gym_details")
@NamedQuery(name = "GymDetail.findAll", query = "SELECT g FROM GymDetail g")
public class GymDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int active;

	private String address;

	private String description;

	private String name;

	// bi-directional many-to-one association to CityDetail

	// bi-directional many-to-one association to Plan
	@JsonIgnore
	@OneToMany(mappedBy = "gymDetail")
	private List<Plan> plans;

	// bi-directional many-to-one association to User
	@JsonIgnore
	@OneToMany(mappedBy = "gymDetail")
	private List<User> users;

	public GymDetail() {
	}

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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public CityDetail getCityDetail() { return this.cityDetail; }
	 * 
	 * public void setCityDetail(CityDetail cityDetail) { this.cityDetail =
	 * cityDetail; }
	 */

	public List<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}

	public Plan addPlan(Plan plan) {
		getPlans().add(plan);
		plan.setGymDetail(this);

		return plan;
	}

	public Plan removePlan(Plan plan) {
		getPlans().remove(plan);
		plan.setGymDetail(null);

		return plan;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setGymDetail(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setGymDetail(null);

		return user;
	}

}