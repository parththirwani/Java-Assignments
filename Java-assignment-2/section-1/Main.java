import utilities.MathUtils;
import shapes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using MathUtils
        int sum = MathUtils.add(5, 10);
        System.out.println("Sum: " + sum);

        // Using Shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers);
    }
}
