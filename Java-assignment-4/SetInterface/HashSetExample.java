import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); 

        System.out.println("HashSet elements: " + names);
    }
}
