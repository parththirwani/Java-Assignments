class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public synchronized void useResource(Resource otherResource) {
        System.out.println(Thread.currentThread().getName() + " locked " + name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " waiting for " + otherResource.name);
        synchronized (otherResource) {
            System.out.println(Thread.currentThread().getName() + " locked " + otherResource.name);
        }
    }
}

public class Deadlock {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> resource1.useResource(resource2), "Thread 1");
        Thread t2 = new Thread(() -> resource2.useResource(resource1), "Thread 2");

        t1.start();
        t2.start();
    }
}
