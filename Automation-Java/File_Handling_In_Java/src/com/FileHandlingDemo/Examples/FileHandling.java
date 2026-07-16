package com.FileHandlingDemo.Examples;
import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		try {
			File myObj=new File("C:/Files/binit.txt");
			if(myObj.createNewFile()) {
				System.out.println("File Created "+myObj.getName());
				System.out.println("Absolute path :"+myObj.getAbsolutePath());
			}
			else {
				System.out.println("File Already Exists");
			}
		}
		catch(IOException e) {
			System.out.println("An Error Occured.");
			e.printStackTrace();
		}

	}

}
