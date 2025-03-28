import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prime primeChecker = new Prime();

        // Taking user input
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        if (primeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}