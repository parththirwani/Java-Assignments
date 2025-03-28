import java.util.*;

public class SynchronizedList{
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        
        list.add(1);
        list.add(2);
    }
}
