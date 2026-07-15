package com.MethodOverloading.Examples;

class Bank{
	public void calculateInterest() {
		System.out.println("General Interest Calculation");
	}
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
	
	class ICICI extends Bank{
		public void calculateInterest() {
			System.out.println("ICICI Interest =8.5%");
		}
	}


public class BankTest {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.calculateInterest();
		
		HDFC hdfc=new HDFC();
		hdfc.calculateInterest();
		
		ICICI icici=new ICICI();
		icici.calculateInterest();
	}

}
