package com.DecisionMakingStatement_CaseSudy;

public class API_Testing {

	public static void main(String[] args) {
		        int statusCode = 404;

		        if (statusCode == 200) {
		            System.out.println("Success");
		        } 
		        else if (statusCode == 201) {
		            System.out.println("Resource Created");
		        } 
		        else if (statusCode == 401) {
		            System.out.println("Unauthorized");
		        } 
		        else if (statusCode == 404) {
		            System.out.println("Resource Not Found");
		        } 
		        else if (statusCode == 500) {
		            System.out.println("Internal Server Error");
		        } 
		        else {
		            System.out.println("Unknown Status Code");
		        }
	}

}
