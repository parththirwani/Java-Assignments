import java.util.*;

public class TreeMapFunc {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        System.out.println("Sorted TreeMap: " + map);
    }
}
