import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlFlowExample example = new ControlFlowExample();

        // Demonstrate if-else
        System.out.print("Enter a number to check (positive/negative/zero): ");
        int number = scanner.nextInt();
        example.checkNumber(number);

        // Demonstrate switch-case
        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int day = scanner.nextInt();
        example.printDayOfWeek(day);

        // Demonstrate for loop
        System.out.print("Enter a number N to print first N natural numbers: ");
        int n = scanner.nextInt();
        example.printNumbers(n);

        scanner.close();
    }
}