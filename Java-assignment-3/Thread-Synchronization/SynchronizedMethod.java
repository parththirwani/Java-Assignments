class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class AccountUser extends Thread {
    private BankAccount account;

    public AccountUser(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        AccountUser user1 = new AccountUser(account);
        AccountUser user2 = new AccountUser(account);

        user1.start();
        user2.start();
    }
}
