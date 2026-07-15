package com.ExceptionHandlingDemo.Examples;

public class ExceptionHandling {
	double balance = 5000;

    void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawn amount: " + amount);
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction Complete");
        }
    }

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();

	        obj.withdraw(6000);
	        obj.withdraw(2000);

	}

}
