public class Main {
    public static void main(String[] args) {
        // Demonstrating Method Overloading
        System.out.println("Method Overloading Examples:");
        System.out.println("---------------------------");
        
        Calculator calc = new Calculator();
        
        // Different versions of add() method
        System.out.println("Result: " + calc.add(5, 3));                  // int version
        System.out.println("Result: " + calc.add(5, 3, 2));              // three parameters
        System.out.println("Result: " + calc.add(5.5, 3.5));             // double version
        System.out.println("Result: " + calc.add("Hello ", "World!"));   // String version
        
        System.out.println("\nMethod Overriding Examples:");
        System.out.println("---------------------------");
        
        // Creating both calculator types
        Calculator basicCalc = new Calculator();
        Calculator sciCalc = new ScientificCalculator();  // Polymorphic reference
        ScientificCalculator sciCalc2 = new ScientificCalculator();
        
        // Demonstrating overridden methods
        System.out.println("\nDisplaying Calculator Info:");
        basicCalc.displayInfo();  // Calls Calculator version
        sciCalc.displayInfo();    // Calls ScientificCalculator version
        
        System.out.println("\nMultiplication Examples:");
        System.out.println("Result: " + basicCalc.multiply(4.0, 3.0));  // Basic version
        System.out.println("Result: " + sciCalc.multiply(4.0, 3.0));    // Scientific version
        
        // Using ScientificCalculator specific method
        System.out.println("\nPower function (only in Scientific Calculator):");
        System.out.println("2 raised to 3 = " + sciCalc2.power(2, 3));
    }
}