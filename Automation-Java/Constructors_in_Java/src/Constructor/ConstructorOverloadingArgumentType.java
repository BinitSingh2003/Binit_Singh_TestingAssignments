package Constructor;

public class ConstructorOverloadingArgumentType {

	public ConstructorOverloadingArgumentType(int a,int b) {
		int c=a+b;
		System.out.println("Summation is: "+c);
	}
	public ConstructorOverloadingArgumentType(double a,double b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}
	public void display() {
		System.out.println("Constructor overloading is workin successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloadingArgumentType c=new ConstructorOverloadingArgumentType(2,5);
		c.display();
		ConstructorOverloadingArgumentType d=new ConstructorOverloadingArgumentType(20.44,45.77);
		d.display();
	}

}
