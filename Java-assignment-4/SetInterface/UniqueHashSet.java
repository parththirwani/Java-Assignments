import java.util.*;

public class UniqueHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); 
        
        System.out.println("HashSet elements: " + numbers);
    }
}
