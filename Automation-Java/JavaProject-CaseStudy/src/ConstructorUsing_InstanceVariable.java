
class Website {

    // Instance variables (fields)
    String webName;
    int webAge;

    // Parameterized Constructor
    Website(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args[]) {

        // Creating objects
        Website obj1 = new Website("Raghavendra", 47);
        Website obj2 = new Website("https://www.google.com/", 18);

        // Displaying object data
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }
}