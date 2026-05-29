public class Person {

    String name;
    private String phone;

    // Constructor
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}

