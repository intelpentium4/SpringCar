package com.personalproject.springboot.cardemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.springboot.cardemo.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
