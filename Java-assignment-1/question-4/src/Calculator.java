public class Calculator {
    // Method Overloading Examples
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    public String add(String a, String b) {
        System.out.println("Adding two strings");
        return a + b;
    }
    
    // Method that will be overridden by child class
    public void displayInfo() {
        System.out.println("This is a basic calculator");
    }
    
    // Another method to be overridden
    public double multiply(double a, double b) {
        System.out.println("Basic multiplication");
        return a * b;
    }
}