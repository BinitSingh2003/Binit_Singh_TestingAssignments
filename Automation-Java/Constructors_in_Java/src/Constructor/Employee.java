package Constructor;

public class Employee {
	private int id;

	private String name;
	private float salary;
	private String ssn;
	
	public Employee(int id, String name, float salary, String ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void raiseSalary(float amount) {
		salary += amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(11,"Kartik",12200.22f,"2345678");
		System.out.println("Employee ID :\t\t"+e.getId());
		System.out.println("Employee ID :\t\t"+e.getName());
		System.out.println("Employee ID :\t\t"+e.getSalary());
		System.out.println("Employee ID :\t\t"+e.getSsn());
		
		e.raiseSalary(1500.00f);
		System.out.println("After Updation....");
		System.out.println("Employee ID :\t\t"+e.getId());

	}

}
