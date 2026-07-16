package com.FileHandlingDemo.Examples;
import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		try {
			File myObj=new File("C:/Files/binit.txt");
			if(myObj.delete()) {
				System.out.println("Deleted the File");
			}
			else {
				System.out.println("Failed to delete the File");
			}
	}
		catch(Exception e) {
			System.out.println("Error Occured");
		}

}
}
