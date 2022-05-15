package com.tracker.dao;

import java.util.List;

import com.tracker.entity.Developer;

public interface DeveloperDAO {

	public List<Developer> getAllDevelopers();
	
	public Boolean addDeveloper(String develoeprName);
	
	public Boolean deleteDeveloper(String develoeprName);
	
}
