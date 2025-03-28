public class Main {
    public static void main(String[] args) {
        // Creating array of Shape interface type
        Shape[] shapes = new Shape[3];
        
        // Creating different shapes
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(3);
        
        // Processing shapes using abstraction
        System.out.println("Shape Details:");
        System.out.println("------------------------");
        for (Shape shape : shapes) {
            shape.displayInfo();
        }
        
        // Demonstrating abstraction through a separate method
        System.out.println("Total Area of all Shapes: " + 
            String.format("%.2f", calculateTotalArea(shapes)));
    }
    
    // Method demonstrating abstraction - works with any Shape
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}