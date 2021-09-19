package com.vaccination.kruger.Inventory.model;

import java.util.Date;

public class UserData {

	
	private String firstname;
	private String lastname;
	private String CI;
	private String email;
	private Date birthday;
	private String address;
	private String mobilephone;
	private Boolean vaccinationStatus;
	private String role;
	private String vaccineType;
	private Date vaccinationDate;
	private Integer dosesReceived;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCI() {
		return CI;
	}

	public void setCI(String CI) {
		this.CI = CI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobilePhone() {
		return mobilephone;
	}

	public void setMobilePhone(String phone) {
		this.mobilephone = phone;
	}

	public Boolean getVaccinationStatus() {
		return vaccinationStatus;
	}

	public void setVaccinationStatus(Boolean vaccinationStatus) {
		this.vaccinationStatus = vaccinationStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public Date getvaccinationDate() {
		return vaccinationDate;
	}

	public void setvaccinationDate(Date vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public Integer getdosesReceived() {
		return dosesReceived;
	}

	public void setdosesReceived(Integer dosesReceived) {
		this.dosesReceived = dosesReceived;
	}

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(String firstname, String lastname, String CI, String email, Date birthday, String address,
			String phone, Boolean vaccinationStatus, String role, String vaccineType, Date vaccinationDate, Integer dosesReceived) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.CI = CI;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
		this.mobilephone = phone;
		this.vaccinationStatus = vaccinationStatus;
		this.role = role;
		this.vaccineType = vaccineType;
		this.vaccinationDate = vaccinationDate;
		this.dosesReceived = dosesReceived;
	}

}
