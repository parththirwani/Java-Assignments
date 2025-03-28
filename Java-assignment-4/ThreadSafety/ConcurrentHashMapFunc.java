import java.util.concurrent.*;

public class ConcurrentHashMapFunc {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");

        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.put(3, "Charlie");
    }
}
