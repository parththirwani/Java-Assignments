public class Prime {
    // Method to check if a number is prime
    public boolean isPrime(int num) {
        // Handle case for numbers less than or equal to 1
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Not a prime number
            }
        }
        return true;  // Prime number
    }
}