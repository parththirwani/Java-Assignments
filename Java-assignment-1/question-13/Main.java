import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeChecker checker = new PrimeChecker();

        // Taking user input
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        if (checker.isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}