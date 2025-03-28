import java.util.*;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Cherry");

        System.out.println("HashMap order: " + hashMap);
        System.out.println("LinkedHashMap order: " + linkedHashMap);
    }
}
