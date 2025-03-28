import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddEven checker = new OddEven();

        // Taking user input
        System.out.print("Enter a number to check if it's odd or even: ");
        int number = scanner.nextInt();

        // Checking if the number is odd or even
        checker.checkOddEven(number);

        scanner.close();
    }
}