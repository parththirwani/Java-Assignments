import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial factorialCalculator = new Factorial();

        // Taking user input
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculating factorial using recursion
        int result = factorialCalculator.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);

        scanner.close();
    }
}