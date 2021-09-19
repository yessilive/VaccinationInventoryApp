package com.vaccination.kruger.Inventory.Interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vaccination.kruger.Inventory.model.UserData;
import com.vaccination.kruger.Inventory.services.UserRegistrationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/inventario/")
public class UserInterfaces {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@PostMapping("/create")

	public ResponseEntity<String> create(@RequestBody UserData user) {

		return ResponseEntity.ok(userRegistrationService.create(user));

	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody(required = true) UserData user) {

		return ResponseEntity.ok(userRegistrationService.update(user));

	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(String dni) {

		return ResponseEntity.ok(userRegistrationService.delete(dni));

	}

	@GetMapping("/find")

	public ResponseEntity<List<UserData>> find(@RequestParam(defaultValue = "true") Boolean status,
			@RequestParam(defaultValue = "") String type, Date startDate, Date endDate) {

		return ResponseEntity.ok(userRegistrationService.find(status, type, startDate, endDate));

	}
}