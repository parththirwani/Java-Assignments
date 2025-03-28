import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacciGenerator = new Fibonacci();

        // Taking user input for the number of terms
        System.out.print("Enter the number of terms to generate in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Generating and displaying the Fibonacci series
        System.out.print("Fibonacci Series: ");
        fibonacciGenerator.generateFibonacci(terms);

        scanner.close();
    }
}