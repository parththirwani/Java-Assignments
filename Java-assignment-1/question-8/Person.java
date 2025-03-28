public class Person {
    String name;
    int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        System.out.println("Copy Constructor Called");
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}