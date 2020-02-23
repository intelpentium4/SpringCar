package com.personalproject.springboot.cardemo.service;

import java.util.List;

import com.personalproject.springboot.cardemo.entity.Vehicle;

public interface VehicleService {

	public List<Vehicle> findAll();
	
	public Vehicle findById(int theId);
	
	public void save(Vehicle vehicle);
	
	public void deleteById(int theId);
}
