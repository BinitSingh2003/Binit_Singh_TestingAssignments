package com.JumpControlStatement.Examples;

public class For_Loop {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=i;
		}
		System.out.println("Sum :"+sum);
		
		String names[]= {"Java","C","C++","Rupy","JavaScript"};
		System.out.println("Printing the content of the Array Name:");
		
		for(String name:names) {
			System.out.println(name);
		}
	}
	
}
