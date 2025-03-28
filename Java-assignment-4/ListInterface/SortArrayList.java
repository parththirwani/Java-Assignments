import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));

        // Sorting alphabetically
        Collections.sort(words);
        System.out.println("Sorted alphabetically: " + words);

        // Sorting reverse alphabetically
        Collections.sort(words, Collections.reverseOrder());
        System.out.println("Sorted in reverse order: " + words);
    }
}
