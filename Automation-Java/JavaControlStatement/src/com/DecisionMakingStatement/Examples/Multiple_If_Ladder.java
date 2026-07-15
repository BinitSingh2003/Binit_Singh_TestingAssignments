package com.DecisionMakingStatement.Examples;

public class Multiple_If_Ladder {

	public static void main(String[] args) {
		
		String city="Noida";
		
		if(city=="Meerut") {
			System.out.println("City is Meerut");
		}
		else if(city=="Noida") {
			System.out.println("City is Noida");
		}
		else if(city=="Agra") {
			System.out.println("City is Agra");
		}
		else {
			System.out.println(city);
		}
	}

}
