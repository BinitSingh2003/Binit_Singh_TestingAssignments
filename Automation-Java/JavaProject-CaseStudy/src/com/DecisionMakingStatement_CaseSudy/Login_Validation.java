package com.DecisionMakingStatement_CaseSudy;

public class Login_Validation {

	public static void main(String[] args) {
		    String username = "admin";
	        String password = "admin123";

	        if(username.equals("admin") && password.equals("admin123")) {
	            System.out.println("Login Successful");
	        }
	        else {
	        	System.out.println("Login Fail");
	        }

	}

}
