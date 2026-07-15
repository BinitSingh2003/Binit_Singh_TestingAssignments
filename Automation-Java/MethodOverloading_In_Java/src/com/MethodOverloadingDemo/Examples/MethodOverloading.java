package com.MethodOverloadingDemo.Examples;

class MoneyTransfer{
	public void transfer(double amount) {
		System.out.println("Transferred Amount: "+amount);
	}
	public void transfer(double amount,String accountNumber) {
		System.out.println("Transferred: "+amount+" to account:"+accountNumber);
	}
	public void transfer(double amount,String accountNumber,String remarks) {
		System.out.println("Transferred "+amount);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Remarks:"+remarks);
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		MoneyTransfer mt=new MoneyTransfer();
		mt.transfer(1000);
		mt.transfer(5000,"SBIN123456");
		mt.transfer(10000,"338232","HouseRent");

	}

}
