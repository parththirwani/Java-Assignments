import java.util.*;

public class ArrayDequeFunc {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);

        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("Removed first: " + deque.pollFirst());
        System.out.println("Removed last: " + deque.pollLast());
    }
}
