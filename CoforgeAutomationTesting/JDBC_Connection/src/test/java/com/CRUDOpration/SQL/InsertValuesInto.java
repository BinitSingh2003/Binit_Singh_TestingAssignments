package com.CRUDOpration.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValuesInto {
	 public static void main(String args[]) throws SQLException{
	  // Database Connection Parameters
			String url = "jdbc:mysql://localhost:3306/seleniumautomation";
	        String username = "root";
	        String password = "16012003";

	        // Establish Database Connection
	        Connection con = DriverManager.getConnection(url, username, password);

	        // Create Statement
	        Statement stmt = con.createStatement();
	        //String query="INSERT INTO book_detl values('AI001','PostmanAPI','API','BINIT','ABC','S','2026','900')";
	       // String query="UPDATE book_detl SET author='Binit Singh' where author='BINIT'";
	        String query="Delete from book_detl where book_no='AI001'";
	        stmt.execute(query);
	        
	        con.close();
	        System.out.println("Statement Executed :Record Updated Successfully");

     } 
	 
}