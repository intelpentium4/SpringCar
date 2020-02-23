package com.personalproject.springboot.cardemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Vehicle {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="model_year")
	private int modelYear;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name="horsepower")
	private int horsePower;
	
	@Column(name="avg_mpg")
	private int avgMpg;
	
	@Column(name="msrp")
	private int msrp;
	
	// define constructors
	public Vehicle() {}

	public Vehicle(int id, int modelYear, String brand, String modelName, int horsePower, int avgMpg, int msrp) {
		this.id = id;
		this.modelYear = modelYear;
		this.brand = brand;
		this.modelName = modelName;
		this.horsePower = horsePower;
		this.avgMpg = avgMpg;
		this.msrp = msrp;
	}

	// define getter/setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getAvgMpg() {
		return avgMpg;
	}

	public void setAvgMpg(int avgMpg) {
		this.avgMpg = avgMpg;
	}

	public int getMsrp() {
		return msrp;
	}

	public void setMsrp(int msrp) {
		this.msrp = msrp;
	}

	// define toString
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", modelYear=" + modelYear + ", brand=" + brand + ", modelName=" + modelName
				+ ", horsePower=" + horsePower + ", avgMpg=" + avgMpg + ", msrp=$" + msrp + "]";
	};
}
