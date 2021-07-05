package com.phani.services;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phani.dao.EmployeeDAO;

@Component
public class MyService {
	Logger logger = LoggerFactory.getLogger(MyService.class);
	
	@Autowired Utils utils;
	public String getFullName(String firstName, String lastName) throws SQLException {
		logger.debug("Reached Service");
		EmployeeDAO employeeDAO =  new EmployeeDAO();
		employeeDAO.insertRecords();
		return utils.getFullName(firstName, lastName);
	}
}
