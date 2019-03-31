package com.SpringBoot.SpringBootJava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SpringBootJava.model.CarModel;

import java.util.Arrays;
import java.util.List;

@RestController

public class CarController {
	@RequestMapping("/hello")
	public List<CarModel> getCarDetails(){
		return Arrays.asList(
			new CarModel("Honda","Civic"),
			new CarModel("Nissan","Sentra")
		);
}
}