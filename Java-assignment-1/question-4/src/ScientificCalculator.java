public class ScientificCalculator extends Calculator {
    // Method Overriding Examples
    @Override
    public void displayInfo() {
        System.out.println("This is a scientific calculator");
    }
    
    @Override
    public double multiply(double a, double b) {
        System.out.println("Scientific multiplication with higher precision");
        return a * b;
    }
    
    // Additional method specific to ScientificCalculator
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}