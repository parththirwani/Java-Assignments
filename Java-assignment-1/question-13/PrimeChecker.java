import java.util.Scanner;

public class PrimeChecker {
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        int i = 2;
        while (i * i <= num) { // Loop until sqrt(num)
            if (num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
            i++;
        }
        return true; // No divisors found, it's a prime number
    }
}