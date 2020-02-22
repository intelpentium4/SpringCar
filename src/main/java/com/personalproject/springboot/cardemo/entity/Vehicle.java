package com.personalproject.springboot.cardemo.entity;

public class Vehicle {
	
	// define fields
	private int id;
	private int modelYear;
	private String brand;
	private String modelName;
	private int horsePower;
	private int avgMpg;
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
				+ ", horsePower=" + horsePower + ", avgMpg=" + avgMpg + ", msrp=" + msrp + "]";
	};
}
