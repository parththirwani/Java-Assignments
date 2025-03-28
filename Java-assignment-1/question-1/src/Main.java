
// Main.java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890");
        
        // Accessing data through public methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        // Making transactions
        account.deposit(1000);
        account.withdraw(500);
    }
}