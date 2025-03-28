class NumberPrinter extends Thread {
    private volatile boolean running = true; 
    public void stopThread() {
        running = false;
    }

    public void run() {
        for (int i = 1; i <= 100 && running; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread Stopped.");
    }
}

public class StopThread{
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.start();

        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        printer.stopThread(); 
    }
}
