package com.tracker.entity;

import org.springframework.stereotype.Component;

@Component
public class Developer {

	private Integer developerID;
	private String developerName;

	public Integer getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(Integer developerID) {
		this.developerID = developerID;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

}
