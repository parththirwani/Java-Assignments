import java.util.concurrent.*;

public class CopyOnWriter {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Runnable task = () -> {
            for (Integer i : list) {
                System.out.println(i);
                list.add(4);
            }
        };

        new Thread(task).start();
    }
}
