public class Fibonacci {
    // Method to generate Fibonacci series up to the nth term
    public void generateFibonacci(int n) {
        int a = 0, b = 1;

        // Print the first two terms if n is greater than or equal to 1
        if (n >= 1) {
            System.out.print(a + " ");
        }
        // Print the next terms if n is greater than or equal to 2
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Generate remaining Fibonacci terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
}