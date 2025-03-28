import java.util.*;

 public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);

        System.out.println("Sorted TreeSet: " + numbers);
    }
}
