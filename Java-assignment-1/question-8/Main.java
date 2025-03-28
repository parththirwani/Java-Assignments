public class Main {
    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.display();

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.display();

        // Using Copy Constructor
        Person person3 = new Person(person2);
        person3.display();
    }
}