import java.util.Scanner;

public class ControlFlowExample {
    
    // Method to demonstrate if-else
    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is a Positive Number.");
        } else if (num < 0) {
            System.out.println(num + " is a Negative Number.");
        } else {
            System.out.println("The number is Zero.");
        }
    }

    // Method to demonstrate switch-case
    public void printDayOfWeek(int day) {
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day! Please enter a number between 1 and 7.");
        }
    }

    // Method to demonstrate for loop
    public void printNumbers(int n) {
        System.out.println("First " + n + " natural numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better formatting
    }
}