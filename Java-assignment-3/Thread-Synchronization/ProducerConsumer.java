import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int SIZE = 5;

    public synchronized void produce(int value) {
        while (queue.size() == SIZE) {
            try {
                wait(); // Wait if the queue is full
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted: " + e.getMessage());
            }
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized void consume() {
        while (queue.isEmpty()) {
            try {
                wait(); // Wait if the queue is empty
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted: " + e.getMessage());
            }
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
    }
}

class Producer extends Thread {
    private SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            sharedQueue.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted: " + e.getMessage());
            }
        }
    }
}

class Consumer extends Thread {
    private SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            sharedQueue.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted: " + e.getMessage());
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        producer.start();
        consumer.start();
    }
}
