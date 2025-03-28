import java.util.*;

public class ShuffleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 2));
        
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
