package com.phani.services;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	public String getFullName(String firstName, String lastName) {
		String fullName = firstName + " "+ lastName;; 
		return fullName; 
	}
}
