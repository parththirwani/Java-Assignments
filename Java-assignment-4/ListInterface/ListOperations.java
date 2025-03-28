import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        // a. Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("After adding elements: " + names);
        
        // b. Removing an element by value and index
        names.remove("Bob");
        System.out.println("After removing 'Bob': " + names);
        names.remove(0);
        System.out.println("After removing index 0: " + names);
        
        // c. Replacing an element
        names.set(0, "David");
        System.out.println("After replacing element at index 0: " + names);
    }
}
