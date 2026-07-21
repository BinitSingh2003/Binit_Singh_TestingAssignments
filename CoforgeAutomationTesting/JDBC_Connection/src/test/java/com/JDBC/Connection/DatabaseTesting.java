package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTesting {
	private Connection connection;
	public void establishedDtabaseConnection() throws ClassNotFoundException, SQLException{
		//Database connection details
		String databaseURL="jdbc:mysql://localhost:3306/SeleniumAutomation";
		String user="root";
		String password="16012003";
		
		//Load MYSQL JDBC driver and establishConnection-
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to database");
	    connection = DriverManager.getConnection(databaseURL,user,password);
	    
	    //check if the connection is successful
	    if(connection==null) {
	    	System.out.println("Database Connection Failed");
	    }
	    else {
	    	System.out.println("DataBase Connection Successful");
	    }
	}

}
