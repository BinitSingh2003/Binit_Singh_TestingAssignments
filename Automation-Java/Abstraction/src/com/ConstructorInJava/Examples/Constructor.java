package com.ConstructorInJava.Examples;

public class Constructor {
	
	//Constructor
	public Constructor() {
		System.out.println("This is a Constructor Block.");
	}
	
	//Method
	public void method() {
		System.out.println("This is the Method Block");
	}

	public static void main(String[] args) {
		Constructor obj=new Constructor();//Default Construction
		//Need to call explicitly for the method
		obj.method();
	}

}
