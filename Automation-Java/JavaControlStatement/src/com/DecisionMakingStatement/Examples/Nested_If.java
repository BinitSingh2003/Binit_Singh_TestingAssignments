package com.DecisionMakingStatement.Examples;

public class Nested_If {

	public static void main(String[] args) {
		
		String address="Delhi   ,India";
		
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.println("City is Meerut");
			}
			else if(address.contains("Noida")) {
				System.out.println("City is Noida");
			}
			else if(address.contains("Agra")) {
				System.out.println("City is Agra");
			}
			else if(address.contains("Delhi")) {
				System.out.println("City is Delhi");
			}
			else {
				System.out.println(address.split(",")[1]);
			}

		}
		else {
			System.out.println("You are not Living in India");
		}
	}

}
