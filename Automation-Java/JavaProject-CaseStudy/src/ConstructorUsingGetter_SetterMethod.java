public class ConstructorUsingGetter_SetterMethod {

    // Static nested class so it can be accessed from main()
    static class Employee {

        private int id;
        private String name;
        private float salary;
        private String ssn;

        // Parameterized Constructor
        public Employee(int id, String name, float salary, String ssn) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.ssn = ssn;
        }

        // Getter Methods
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getSalary() {
            return salary;
        }

        public String getSsn() {
            return ssn;
        }

        // Setter Methods
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        // Method to raise salary
        public void raiseSalary(float amount) {
            this.salary += amount;
        }
    }

    public static void main(String[] args) {

        // Creating Employee object using constructor
        Employee binit = new Employee(123, "Binit Singh", 33000.0f, "450853053");

        System.out.println("Employee Details");
        System.out.println("ID      : " + binit.getId());
        System.out.println("Name    : " + binit.getName());
        System.out.println("Salary  : " + binit.getSalary());
        System.out.println("SSN     : " + binit.getSsn());

        // Updating Salary
        binit.raiseSalary(15000.0f);

        System.out.println("\nAfter Salary Updation");
        System.out.println("Updated Salary : " + binit.getSalary());
    }
}
