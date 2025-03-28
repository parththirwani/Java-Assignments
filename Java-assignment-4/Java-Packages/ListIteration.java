import java.util.*;

public class ListIteration {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // a. Simple for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // b. Enhanced for loop
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // c. While loop with Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
