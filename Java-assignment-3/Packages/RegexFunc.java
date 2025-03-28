import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegexFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }

        scanner.close();
    }
}
