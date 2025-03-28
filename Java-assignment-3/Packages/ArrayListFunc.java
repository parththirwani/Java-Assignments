import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunc {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(89);
        numbers.add(55);
        numbers.add(2);
        numbers.add(34);
        numbers.add(67);
        numbers.add(10);

        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);
    }
}
