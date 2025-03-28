import java.util.*;

public class CollectionPrinter {
    public static <T> void printCollection(Collection<T> collection) {
        for (T element : collection) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Set<String> names = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));

        printCollection(numbers);
        printCollection(names);
    }
}
