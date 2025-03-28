class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 1");
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted: " + e.getMessage());
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 2");
            try {
                Thread.sleep(2000); // 2-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
