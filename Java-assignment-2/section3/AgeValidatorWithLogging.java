package section3;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

// Custom Exception Class
class InvalidAgeExceptionWithLogging extends Exception {
    public InvalidAgeExceptionWithLogging(String message) {
        super(message);
    }
}

public class AgeValidatorWithLogging {
    private static final Logger logger = Logger.getLogger(AgeValidatorWithLogging.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("section3/age_validator.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            System.out.println("Logging setup failed: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeExceptionWithLogging {
        if (age < 18) {
            throw new InvalidAgeExceptionWithLogging("Age must be at least 18.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("Access granted.");
        } catch (InvalidAgeExceptionWithLogging e) {
            System.out.println("Exception: " + e.getMessage());
            logger.warning("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
