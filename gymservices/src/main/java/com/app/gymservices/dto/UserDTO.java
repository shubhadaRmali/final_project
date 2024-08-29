package com.app.gymservices.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String fullName;

	private int active;

	private String address;

	private String email;

	// private String emailVerificationCode;

	private String userName;

	private String password;

	private String phone;

	private int verified;

	private int roleId;

	private String roleDescription;

	private int gymId;

	private String gymName;

	private int age;

	private String gender;

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

	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/*
	 * // bi-directional many-to-one association to GymDetail
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "gym_id") private GymDetail gymDetail;
	 * 
	 * // bi-directional many-to-one association to Role
	 * 
	 * @ManyToOne private Role role;
	 */

	/*
	 * public User() { }
	 */

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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public String getEmailVerificationCode() { return this.emailVerificationCode;
	 * }
	 * 
	 * public void setEmailVerificationCode(String emailVerificationCode) {
	 * this.emailVerificationCode = emailVerificationCode; }
	 */

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

	public int getVerified() {
		return this.verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
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

	/*
	 * public GymDetail getGymDetail() { return this.gymDetail; }
	 * 
	 * public void setGymDetail(GymDetail gymDetail) { this.gymDetail = gymDetail; }
	 * 
	 * public Role getRole() { return this.role; }
	 * 
	 * public void setRole(Role role) { this.role = role; }
	 */
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", fullname=" + fullName + ", active=" + active + ", address=" + address
				+ ", email=" + email + ", username=" + userName + ", password=" + password + ", phone=" + phone
				+ ", verified=" + verified + "]";
	}

}
