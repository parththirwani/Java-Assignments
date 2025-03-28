import java.util.*;

public class LinkedHashSetIteration {
    public static void main(String[] args) {
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Banana");
        orderedSet.add("Apple");
        orderedSet.add("Cherry");
        
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : orderedSet) {
            System.out.println(fruit);
        }
    }
}
