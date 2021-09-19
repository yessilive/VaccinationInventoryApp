package com.vaccination.kruger.Inventory.services;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination.kruger.Inventory.entity.*;
import com.vaccination.kruger.Inventory.model.*;
import com.vaccination.kruger.Inventory.repository.*;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRepository userRepository;

	public String create(UserData user) {
		String response = null;
		try {
			if (user.getCI().length() == 10) {

			}
			UserEntity entity = new UserEntity();
			entity.setAddress(user.getAddress());
			entity.setFirstname(user.getFirstname());
			entity.setLastname(user.getLastname());
			entity.setBirthday(user.getBirthday());
			entity.setdosesReceived(user.getdosesReceived());
			entity.setCI(user.getCI());
			entity.setEmail(user.getEmail());
			entity.setMobilePhone(user.getMobilePhone());
			entity.setRole(user.getRole());
			entity.setVaccinationDate(user.getvaccinationDate());
			entity.setVaccinationStatus(user.getVaccinationStatus());
			entity.setVaccineType(user.getVaccineType());

			userRepository.save(entity);
			response = "Succesful Registration";
		} catch (Exception e) {
			response = "Unsuccesful Registration";
		}
		return response;
	}

	public List<UserData> find(Boolean status, String type, Date startDate, Date endDate) {
		List<UserData> users = null;
		try {
			List<UserEntity> userList = userRepository
					.findByVaccinationStatusAndVaccineTypeIgnoreCaseContainingAndVaccinationDateBetween(status, type, startDate,
							endDate);

			if (!userList.isEmpty()) {
				users = new ArrayList<>();
				for (UserEntity u : userList) {
					UserData user = new UserData();
					user.setAddress(u.getAddress());
					user.setBirthday(u.getBirthday());
					user.setdosesReceived(u.getdosesReceived());
					user.setCI(u.getCI());
					user.setEmail(u.getEmail());
					user.setFirstname(u.getFirstname());
					user.setLastname(u.getLastname());
					user.setMobilePhone(u.getMobilePhone());
					user.setRole(u.getRole());
					user.setvaccinationDate(u.getVaccinationDate());
					user.setVaccinationStatus(u.getVaccinationStatus());
					user.setVaccineType(u.getVaccineType());
					users.add(user);
				}
			} else {
				users = new ArrayList<>();
			}
		} catch (Exception e) {
			users = new ArrayList<>();
		}
		return users;
	}

	public String update(UserData user) {
		String response = null;
		try {
			UserEntity u = userRepository.findByCI(user.getCI()).stream().findFirst().orElse(null);
			if (u != null) {
				u.setAddress(user.getAddress());
				u.setBirthday(user.getBirthday());
				u.setdosesReceived(user.getdosesReceived());
				u.setCI(user.getCI());
				u.setEmail(user.getEmail());
				u.setFirstname(user.getFirstname());
				u.setLastname(user.getLastname());
				u.setMobilePhone(user.getMobilePhone());
				u.setRole(user.getRole());
				u.setVaccinationDate(user.getvaccinationDate());
				user.setVaccinationStatus(user.getVaccinationStatus());
				user.setVaccineType(user.getVaccineType());

				userRepository.save(u);
				response = "OK";
			} else {
				response = "ERROR";
			}

		} catch (Exception e) {
			response = "ERROR";
		}
		return response;
	}

	public String delete(String CI) {
		String response = null;
		try {
			UserEntity u = userRepository.findByCI(CI).stream().findFirst().orElse(null);
			if (u != null) {
				userRepository.delete(u);
				response = "OK";
			} else {
				response = "ERROR";
			}
		} catch (Exception e) {
			response = "ERROR";
		}
		return response;
	}
}
