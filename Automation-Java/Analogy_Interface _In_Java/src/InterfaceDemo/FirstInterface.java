package InterfaceDemo;

interface FirstInterface {
	public void myMethod(); //interface method
}

interface SecondInterface{
	public void myOtherMethod(); //interface method
}

//Demo "implements" FirstInterface and Second Interface.
 class DemoClass implements FirstInterface,SecondInterface{
	 public void myMethod() {
		 System.out.println("Enter Some text");
	 }
	 public void myOtherMethod() {
		 System.out.println("Enter Some Other text..");
	 }
 }
class main{
	 public static void main(String args[]) {
		 DemoClass myObj=new DemoClass();
		  myObj.myMethod();
	      myObj.myOtherMethod();
		 
	 }
 }

