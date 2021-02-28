package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.service.CourseService;



@RestController

public class Mycontroller {
	
	@Autowired
	private CourseService courseService;
	
	
	
	@GetMapping("/home")
	public String home()
	{
		
		return "this is my home page";
	}
    
	 
	
	
	
	
	
	// get courses 
	@GetMapping("/courses")
	public List<course>  getcourse()
	{
	 
		return this.courseService.getCourses();		
	}
	
	
	
	
	@PostMapping("/courses")
	public course  addCourse(@RequestBody course course)
	{
	 
		return this.courseService.addCourse(course);		
	}
	
	
	//this is a controller file

}
