package com.personalproject.springboot.cardemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		return "vehicles/list-vehicles";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// create model attribute to bind form data
		Vehicle theVehicle = new Vehicle();
		theModel.addAttribute("vehicle", theVehicle);
		return "vehicles/vehicle-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("vehicleId") int theId,
									Model theModel) {
		// get the vehicle from the service
		Vehicle theVehicle = vehicleService.findById(theId);
		
		// set the vehicle as a model attribute to pre-populate the form
		theModel.addAttribute("vehicle", theVehicle);
		
		// send over to our form
		return "vehicles/vehicle-form";
	}
	
	@PostMapping("/save")
	public String saveVehicle(@ModelAttribute("vehicle") Vehicle theVehicle) {
		
		// save the vehicle
		vehicleService.save(theVehicle);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/vehicles/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("vehicleId") int theId) {
		
		// delete the vehicle
		vehicleService.deleteById(theId);
		// redirect to vehicles/list
		return "redirect:/vehicles/list";
	}
	
}
