package Constructor;

public class Constructor_C1 {
	
	public Constructor_C1(){
		System.out.println("This is the constructor block");
		
	}
	public void method() {
		System.out.println("This is the method block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_C1 obj=new Constructor_C1();
		obj.method();
	}

}
