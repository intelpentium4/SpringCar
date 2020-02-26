package com.personalproject.springboot.cardemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personalproject.springboot.cardemo.entity.Vehicle;
import com.personalproject.springboot.cardemo.service.VehicleService;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {
	
	private VehicleService vehicleService;
	
	@Autowired
	public VehicleController(VehicleService theVehicleService) {
		vehicleService = theVehicleService;
	}
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listVehicles(Model theModel) {
		
		// Get vehicles from the db
		List<Vehicle> theVehicles = vehicleService.findAll();
		
		// add to the spring model
		theModel.addAttribute("vehicles", theVehicles );
		
		return "list-vehicles";
	}
}
