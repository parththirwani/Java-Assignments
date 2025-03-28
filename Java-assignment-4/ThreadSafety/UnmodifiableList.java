import java.util.*;

public class UnmodifiableList{
    public static void main(String[] args) {
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        list.add(4); 
    }
}
