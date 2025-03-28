import java.util.*;

class CovarianceExample {
    static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }
}

class ContravarianceExample {
    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}

public class T {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        CovarianceExample.printList(intList);

        List<Number> numList = new ArrayList<>();
        ContravarianceExample.addNumbers(numList);
        System.out.println(numList);
    }
}
