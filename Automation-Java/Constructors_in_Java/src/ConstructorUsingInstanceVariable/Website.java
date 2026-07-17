package ConstructorUsingInstanceVariable;

public class Website {
     //	Instance variable

	String webName;
	int webAge;
	
    //	Constructor
	public Website(String webName, int webAge) {
		
		this.webName = webName;
		this.webAge = webAge;
	}

	public static void main(String[] args) {
		Website s1=new Website("Kartik",22);
		Website s2=new Website("https://www.google.com",18);
		System.out.println(s1.webName + " "+s1.webAge);
		System.out.println(s2.webName + " "+s2.webAge);

	}

}
