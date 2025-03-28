package section3;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Try-Catch Example
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result (Try-Catch): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }

        // Try-Catch-Finally Example
        System.out.print("\nEnter another numerator: ");
        int num = scanner.nextInt();
        System.out.print("Enter another denominator: ");
        int den = scanner.nextInt();

        try {
            int res = num / den;
            System.out.println("Result (Try-Catch-Finally): " + res);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed - Cleaning up resources.");
        }

        scanner.close();
    }
}
