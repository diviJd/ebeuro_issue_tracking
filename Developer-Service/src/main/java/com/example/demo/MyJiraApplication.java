package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.tracker.entity.Story;



@SpringBootApplication
public class MyJiraApplication {

	@Autowired
	private RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MyJiraApplication.class, args);
		
		//TO DO : Add developers using DeveloperController
		
		//TO DO: Add Stories using Story-Service
		
		//TO DO: Add Bugs using Bug-Service		
		
		//TO DO: Get Plan using Planning-Service
		
		
	}

}
