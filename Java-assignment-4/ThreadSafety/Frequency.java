import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "apple");
        System.out.println(Collections.frequency(list, "apple"));
    }
}
