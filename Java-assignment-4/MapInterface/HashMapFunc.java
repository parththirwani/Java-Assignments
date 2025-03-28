import java.util.*;

public class HashMapFunc {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        

        System.out.println("Contains key 102? " + employees.containsKey(102));


        System.out.println("Iterating using KeySet:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + ": " + employees.get(id));
        }

        System.out.println("Iterating using EntrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
