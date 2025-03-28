import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindromeChecker = new Palindrome();

        // Taking input from user
        System.out.print("Enter a string or number to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check if input is a number or string
        if (input.matches("-?\\d+")) {  // If the input is a number
            int num = Integer.parseInt(input);
            if (palindromeChecker.isNumberPalindrome(num)) {
                System.out.println(num + " is a Palindrome.");
            } else {
                System.out.println(num + " is NOT a Palindrome.");
            }
        } else {  // If the input is a string
            if (palindromeChecker.isStringPalindrome(input)) {
                System.out.println("\"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + input + "\" is NOT a Palindrome.");
            }
        }

        scanner.close();
    }
}