package com.SpringBoot.SpringBootJava.model;

public class CarModel {
	private String manufacturer;
	private String name;
	
	public CarModel() {
	}
	
	public CarModel(String manufacturer, String name) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
