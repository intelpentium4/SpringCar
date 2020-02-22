package com.personalproject.springboot.cardemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personalproject.springboot.cardemo.entity.Vehicle;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

	// load vehicle data
	private List<Vehicle> theVehicles;
	
	@PostConstruct
	private void loadData() {
		// create Vehicles
		Vehicle car1 = new Vehicle(1, 2020, "Toyota", "Camry", 203, 32, 24_425);
		Vehicle car2 = new Vehicle(1, 2020, "Hyundai", "Veloster", 147, 29, 18_800);
		Vehicle car3 = new Vehicle(1, 2019, "Toyota", "Prius", 121, 52, 24_325);
	
		// create the list
		theVehicles = new ArrayList<>();
		
		// add to the list
		theVehicles.add(car1);
		theVehicles.add(car2);
		theVehicles.add(car3);
	}
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listVehicles(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("vehicles", theVehicles );
		
		return "list-vehicles";
	}
}
