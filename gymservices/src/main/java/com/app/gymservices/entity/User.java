package com.app.gymservices.entity;

import java.io.Serializable;

import com.app.gymservices.util.Active;
import com.app.gymservices.util.Verified;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Active active;

	private String address;

	private String email;

	@Column(name = "email_verification_code")
	private String emailVerificationCode;

	@Column(name = "fullname")
	private String fullName;

	@Column(name = "username")
	private String userName;

	private String password;

	private String phone;

	private int age;

	private String gender;

	// bi-directional many-to-one association to GymDetail
	@ManyToOne
	@JoinColumn(name = "gym_id")
	private GymDetail gymDetail;

	// bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private Verified verified;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Active getActive() {
		return this.active;
	}

	public void setActive(Active active2) {
		this.active = active2;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailVerificationCode() {
		return this.emailVerificationCode;
	}

	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Verified getVerified() {
		return this.verified;
	}

	public void setVerified(Verified verified2) {
		this.verified = verified2;
	}

	public GymDetail getGymDetail() {
		return this.gymDetail;
	}

	public void setGymDetail(GymDetail gymDetail) {
		this.gymDetail = gymDetail;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}