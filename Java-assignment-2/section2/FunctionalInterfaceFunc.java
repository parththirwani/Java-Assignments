package section2;

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class FunctionalInterfaceFunc{
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.compute(5, 3));
        System.out.println("Subtraction: " + subtraction.compute(5, 3));
        System.out.println("Multiplication: " + multiplication.compute(5, 3));
    }
}
