package com.BankingApplication.Examples;
class Account{
	String accountHolder="Binit Singh";
	double balance=100000;
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount Deposit: "+amount);	
		}
	
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount Withdraw: "+amount);	
		}
	public void displayBalance() {
		System.out.println("Current balance: "+balance);	
		}
}

class SavingsAccount extends Account{
	public void calculateInterest() {
		double interest=balance*5/100;
		System.out.println("Interest Earn: "+interest);
	}
}

public class BankingApp {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount();
		System.out.println("Account Holder Name: "+sa.accountHolder);
		sa.deposit(5000);
		sa.withdraw(2000);
		sa.displayBalance();
		sa.calculateInterest();
	}

}
