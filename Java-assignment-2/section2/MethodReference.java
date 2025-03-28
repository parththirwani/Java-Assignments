package section2;

import java.util.function.Function;

public class MethodReference {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = MethodReference::square;
        System.out.println("Square of 5: " + squareFunction.apply(5));
    }
}
