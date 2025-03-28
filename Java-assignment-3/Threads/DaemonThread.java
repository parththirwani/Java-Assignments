class DaemonThreadExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running");
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class DaemonThread{
    public static void main(String[] args) {
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        daemonThread.setDaemon(true); // Setting thread as daemon
        daemonThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread Running");
            try {
                Thread.sleep(2000); // 2-second delay
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Main thread ending, daemon thread will also stop.");
    }
}
