package com.phani.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

public class DerbyConnection {
	private static final String SERVER_DRIVER = "org.apache.derby.jdbc.ClientDriver";
	private static final String SERVER_JDBC_URL = "jdbc:derby://localhost:1527/appdb";
	
	Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName(SERVER_DRIVER); // optional
			this.connection = DriverManager.getConnection(SERVER_JDBC_URL);
			if(this.connection != null) {
				System.out.println("Derby Connection is successfull");
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return this.connection;
	}
	
	public static void main(String[] args) {
		DerbyConnection derbyConnection = new DerbyConnection();
		System.out.println(derbyConnection.getConnection());
	}
}
