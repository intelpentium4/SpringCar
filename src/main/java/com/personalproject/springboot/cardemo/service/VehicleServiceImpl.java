package com.personalproject.springboot.cardemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.personalproject.springboot.cardemo.dao.VehicleRepository;
import com.personalproject.springboot.cardemo.entity.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	private VehicleRepository vehicleRepository;
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
	@Override
	public List<Vehicle> findAll() {
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle findById(int theId) {
		Optional<Vehicle> result = vehicleRepository.findById(theId);
		
		Vehicle car = null;
		if(result.isPresent()) {
			car = result.get();
		}
		else {
			// we didn't find the vehicle
			throw new RuntimeException("Did not find vehicle if - " + theId);
		}
		
		return car;
	}

	@Override
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteById(int theId) {
		vehicleRepository.deleteById(theId);
	}

}
