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

/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int active;

	private String description;

	private String name;

	// bi-directional many-to-one association to User
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	private List<User> users;

	public Role() {
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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setRole(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setRole(null);

		return user;
	}

}