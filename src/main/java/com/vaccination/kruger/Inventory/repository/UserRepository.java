package com.vaccination.kruger.Inventory.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination.kruger.Inventory.entity.*;

public interface UserRepository extends JpaRepository<UserEntity, Long>{ 
	
	public List<UserEntity> findByCI(String CI);
	public void deleteByCI(String CI);
	public List<UserEntity> findByVaccinationStatusAndVaccineTypeIgnoreCaseContainingAndVaccinationDateBetween(Boolean status, String type, Date startDate, Date endDate);
    
}