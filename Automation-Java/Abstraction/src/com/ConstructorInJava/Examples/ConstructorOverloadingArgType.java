package com.ConstructorInJava.Examples;

public class ConstructorOverloadingArgType {
	//Constructor1
	public ConstructorOverloadingArgType(int a,int b) {
		int c= a+ b;
		System.out.println("Summation is:"+c);
	}
	
	//Constructor2

	public ConstructorOverloadingArgType(double a,double b) {
		double c= a+ b;
		System.out.println("Summation is:"+c);
	}
	
	//Method
	public void display() {
		System.out.println("Constructor Oveloading is Working Successfully");
	}
	public static void main(String[] args) {
		ConstructorOverloadingArgType obj1=new ConstructorOverloadingArgType(10,20);
		obj1.display();
		ConstructorOverloadingArgType obj2=new ConstructorOverloadingArgType(20.55,20.51);
		obj2.display();
	}

}
