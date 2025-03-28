import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int index = Collections.binarySearch(list, 3);
        System.out.println(index);
    }
}
