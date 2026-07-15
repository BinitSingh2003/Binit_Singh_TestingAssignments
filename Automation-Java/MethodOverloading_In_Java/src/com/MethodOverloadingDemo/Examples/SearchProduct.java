package com.MethodOverloadingDemo.Examples;

class SearchPro{
	public void Search(String ProductName) {
		System.out.println("Searching by Product Name");
	}
	public void Search(String ProductName,String Brand) {
		System.out.println("Searching by Product and Brand");
	}
	public void Search(String ProductName,String Brand,int Price) {
		System.out.println("Searching by Product,Brand and Price");
	}
	
	
}

public class SearchProduct {

	public static void main(String[] args) {
		SearchPro sp=new SearchPro();
		sp.Search("Laptop");
		sp.Search("Laptop","MAC");
		sp.Search("Laptop","HP",110000);
		
	}

}
