package package1;

public class Person {
    private String name = "Private Name";  // Private: Only accessible within this class
    String address = "Default Address";    // Default: Accessible within the same package
    protected int age = 30;                // Protected: Accessible within the package and subclasses
    public String nationality = "Public Nationality"; // Public: Accessible everywhere

    public void showDetails() {
        System.out.println("Private: " + name);
        System.out.println("Default: " + address);
        System.out.println("Protected: " + age);
        System.out.println("Public: " + nationality);
    }
}