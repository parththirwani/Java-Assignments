import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // a. Add elements
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(7);
        System.out.println("TreeSet: " + treeSet);

        // b. Find smallest and largest
        System.out.println("Smallest: " + treeSet.first());
        System.out.println("Largest: " + treeSet.last());

        // c. Remove an element
        treeSet.remove(7);
        System.out.println("After removing 7: " + treeSet);
    }
}
