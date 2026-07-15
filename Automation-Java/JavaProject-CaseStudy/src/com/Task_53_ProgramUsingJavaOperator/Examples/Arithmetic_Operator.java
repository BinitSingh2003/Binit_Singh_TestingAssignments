package com.Task_53_ProgramUsingJavaOperator.Examples;

public class Arithmetic_Operator {

	public static void main(String[] args) {
		//E-Commerce Application
		int laptopPrice = 50000;
		int quantity = 2;

		int totalPrice = laptopPrice * quantity;
		int discount = 5000;
		int finalAmount = totalPrice - discount;
		int gst = 18;
		int gstAmount = (finalAmount * gst) / 100;

		System.out.println("Laptop Price = ₹" + laptopPrice);
		System.out.println("Quantity = " + quantity);
		System.out.println("Total Price = ₹" + totalPrice);
		System.out.println("Discount = ₹" + discount);
		System.out.println("GST Amount = ₹" + gstAmount);
		System.out.println("Final Amount = ₹" + (finalAmount + gstAmount));

	}

}
