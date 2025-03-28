package package2;

import package1.Person;
import package1.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        
        // System.out.println("Private: " + person.name); // ❌ Not Accessible
        // System.out.println("Default: " + person.address); // ❌ Not Accessible (different package)
        // System.out.println("Protected: " + person.age); // ❌ Not Accessible (not a subclass)
        System.out.println("Public: " + person.nationality); // ✅ Accessible (public)

        // Accessing through subclass
        Student student = new Student();
        student.showStudentDetails(); // This works because Student is in the same package as Person
    }
}