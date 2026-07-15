package com.Abstraction_In_Java.Examples;

import com.MethodOverloading.Examples.Bank;
import com.MethodOverloading.Examples.SBI;

abstract class Bank{
	public void deposit() {
		System.out.println("Money Deposited");
	}
	public void withdraw() {
		System.out.println("Money Withdraw");
		}
	abstract void calculateInterest();
}
	
	class SBI extends Bank{
		public void calculateInterest() {
			System.out.println("SBI Interest = 6.5%");
		}
	}
	
	class HDFC extends Bank{
		public void calculateInterest() {
			System.out.println("HDFC Interest = 7%");
		}
	}
	

public class AbstractionDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();

	}

}
