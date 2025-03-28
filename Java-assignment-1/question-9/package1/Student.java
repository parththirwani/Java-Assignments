package package1;

public class Student extends Person {
    public void showStudentDetails() {
        // System.out.println("Private: " + name); // ❌ Not Accessible
        System.out.println("Default: " + address); // ✅ Accessible (same package)
        System.out.println("Protected: " + age); // ✅ Accessible (inherited)
        System.out.println("Public: " + nationality); // ✅ Accessible
    }
}