public class Person {
    String name;

    public Person(String name) {
        this.name = name; // Using 'this' to refer to the instance variable
    }

    public void display() {
        System.out.println("Person's Name: " + name);
    }
}