package com.DecisionMakingStatement_CaseSudy;

public class ECommerceDiscount {

	public static void main(String[] args) {
		double cartAmount = 6000;

        if(cartAmount >= 5000) {
            System.out.println("Congratulations! You received a 10% discount.");
        }
        else {
        	System.out.println("Better Luck next time!");
        }
	}

}
