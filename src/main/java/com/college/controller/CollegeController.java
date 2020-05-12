package com.college.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

	@GetMapping("/get")
	public String get() {
		System.out.println("Welcome to Deployment!!!");
		return "Welcome to Deployment!!!";
	}

	@GetMapping("/post")
	public String post() {
		System.out.println("Welcome to World!!!");
		return "Welcome to World!!!";
	}

}
