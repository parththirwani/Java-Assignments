import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        ArraySum arraySum = new ArraySum();
        
        // Calculating and displaying the sum of the array elements
        int sum = arraySum.findSum(arr);
        System.out.println("The sum of all elements in the array is: " + sum);

        scanner.close();
    }
}