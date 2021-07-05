package com.phani.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.phani.connection.DerbyConnection;

public class EmployeeDAO {
	
	DerbyConnection derbyConnection = new DerbyConnection();
	
	public void insertRecords() {
		Connection connection = derbyConnection.getConnection();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			stmt.execute("INSERT INTO appdb.users (id, name, login, password) VALUES (456,'Lecturer','Nimmakayala', 'pwd')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
