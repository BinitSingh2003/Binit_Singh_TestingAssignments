package ScannerClassDemo;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The Number is : "+a);
		//sc.close();
		
		System.out.println("Pls Enter your First Name");
		String FirstInitial=sc.nextLine();
		System.out.println("Pls Enter your Last Name");
	    String LastInitial=sc.nextLine();
		System.out.println("Pls Enter your House Name");
		int houseNumber=sc.nextInt();
		System.out.println("Pls Enter your Street Name");
		String streetType=sc.nextLine();
		System.out.println("Enter your City Name");
		String city=sc.nextLine();
		System.out.println(FirstInitial+" "+LastInitial+" "+houseNumber+" ");
		System.out.println(streetType+" "+streetType+" "+city);
		
		
		
	}

}
