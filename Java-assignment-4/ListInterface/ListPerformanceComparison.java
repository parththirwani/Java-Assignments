import java.util.*;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int elements = 100000;

        // a. Adding elements at the beginning
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) arrayList.add(0, i);
        long end = System.nanoTime();
        System.out.println("ArrayList add at beginning: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < elements; i++) linkedList.add(0, i);
        end = System.nanoTime();
        System.out.println("LinkedList add at beginning: " + (end - start) + " ns");

        // b. Removing elements from the middle
        start = System.nanoTime();
        for (int i = 0; i < elements / 2; i++) arrayList.remove(arrayList.size() / 2);
        end = System.nanoTime();
        System.out.println("ArrayList remove from middle: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < elements / 2; i++) linkedList.remove(linkedList.size() / 2);
        end = System.nanoTime();
        System.out.println("LinkedList remove from middle: " + (end - start) + " ns");

        // c. Iterating through the list
        start = System.nanoTime();
        for (int num : arrayList) {}
        end = System.nanoTime();
        System.out.println("ArrayList iteration: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int num : linkedList) {}
        end = System.nanoTime();
        System.out.println("LinkedList iteration: " + (end - start) + " ns");
    }
}
