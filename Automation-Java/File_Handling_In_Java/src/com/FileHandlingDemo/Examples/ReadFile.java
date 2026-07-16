package com.FileHandlingDemo.Examples;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class ReadFile {

	public static void main(String[] args) {
		 try {
	            File myObj = new File("C:/Files/binit.txt");
	            Scanner myReader = new Scanner(myObj);

	            while (myReader.hasNextLine()) {
	                String data = myReader.nextLine();
	                System.out.println(data);
	            }

	            myReader.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("An Error Occurred - File Not Found.");
	            e.printStackTrace();
	        }
	    }
	}