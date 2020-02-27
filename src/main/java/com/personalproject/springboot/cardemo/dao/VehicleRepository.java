package com.personalproject.springboot.cardemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.personalproject.springboot.cardemo.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
