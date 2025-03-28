package section2;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaSort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Mango");
        names.add("Orange");

        names.sort((s1, s2) -> s2.compareTo(s1)); // Sort in descending order

        System.out.println("Sorted List: " + names);
    }
}
