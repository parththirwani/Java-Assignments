import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (elements.isEmpty()) throw new RuntimeException("Stack is empty");
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) throw new RuntimeException("Stack is empty");
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

public class StackFunc {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());

        Stack<String> strStack = new Stack<>();
        strStack.push("Hello");
        strStack.push("World");
        System.out.println(strStack.pop());
        System.out.println(strStack.peek());
    }
}
