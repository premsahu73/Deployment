package com.college.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Student;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/college")
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

	static int postCount =1;
    
    @PostMapping("/postApi")
    public Student postAPI(@RequestBody Student uiStudent){
    	postCount++;
    	System.out.println("post call count "+ postCount);
    	System.out.println("name : "+uiStudent.getName());
    	Student student = new Student();
		student.setName(uiStudent.getName());
		student.setSex(uiStudent.getSex());
        return student;
    }
    
    static int getCount =1;
    
    @GetMapping("/getApi")
    public Student getAPI(){
    	getCount++;
    	System.out.println("get call count "+ getCount);
    	Student student = new Student();
		student.setName("Prem");
		student.setSex("Male");
        return student;
    }
}
