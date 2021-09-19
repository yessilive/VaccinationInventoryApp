package com.vaccination.kruger.Inventory.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = UserEntity.TABLE_NAME, schema = UserEntity.SCHEMA)
public class UserEntity {

	protected static final String TABLE_NAME = "User";
	protected static final String SEQUENCE = "SEQ_User";
	protected static final String SCHEMA = "PUBLIC";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
	@SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1, schema = UserEntity.SCHEMA)
	@Column(name = "ID")
	private Long ID;
	@Column(name = "name")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "cedula")
	private String CI;
	@Column(name = "email")
	private String email;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "address")
	private String address;
	@Column(name = "mobilephone")
	private String mobilephone;
	@Column(name = "Vaccination_Status")
	private Boolean vaccinationStatus;
	@Column(name = "role")
	private String role;
	@Column(name = "vaccine_type")
	private String vaccineType;
	@Column(name = "vaccination_date")
	private Date vaccinationDate;
	@Column(name = "number_doses")
	private Integer dosesReceived;

	public Long getId() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

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

	public Date getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(Date vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public Integer getdosesReceived() {
		return dosesReceived;
	}

	public void setdosesReceived(Integer dosesReceived) {
		this.dosesReceived = dosesReceived;
	}

}
