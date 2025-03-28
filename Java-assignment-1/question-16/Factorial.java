public class Factorial {
    // Recursive method to calculate factorial
    public int calculateFactorial(int num) {
        if (num == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return num * calculateFactorial(num - 1); // Recursive call
        }
    }
}