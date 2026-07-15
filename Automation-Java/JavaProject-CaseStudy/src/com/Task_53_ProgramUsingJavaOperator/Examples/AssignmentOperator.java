package com.Task_53_ProgramUsingJavaOperator.Examples;

public class AssignmentOperator {

	public static void main(String[] args) {
		int accountBalance = 10000;

		accountBalance += 500;
		System.out.println("After Deposit: " + accountBalance);

		accountBalance -= 1000;
		System.out.println("After Withdrawal: " + accountBalance);

		accountBalance *= 2;
		System.out.println("Double Balance: " + accountBalance);

		accountBalance /= 2;
		System.out.println("After Division: " + accountBalance);

		accountBalance %= 3000;
		System.out.println("Remainder Balance: " + accountBalance);

	}

}
