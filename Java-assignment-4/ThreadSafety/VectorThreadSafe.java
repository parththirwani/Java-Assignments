import java.util.*;

public class VectorThreadSafe {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
