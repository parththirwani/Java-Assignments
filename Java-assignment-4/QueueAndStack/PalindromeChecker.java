import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
