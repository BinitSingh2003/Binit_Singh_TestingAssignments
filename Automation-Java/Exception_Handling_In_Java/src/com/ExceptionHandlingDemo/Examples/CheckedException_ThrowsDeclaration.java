package com.ExceptionHandlingDemo.Examples;

public class CheckedException_ThrowsDeclaration {
    int x=143;
	
	public void m1() {
		System.out.println("Value of X is: "+x);
	}

	public static void main(String[] args) throws InterruptedException {
		CheckedException_ThrowsDeclaration obj=new CheckedException_ThrowsDeclaration();
		obj.m1();
	    Thread.sleep(0);
	}
}
