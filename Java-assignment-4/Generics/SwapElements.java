import java.util.Arrays;

class SwapUtil {
    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

public class SwapElements {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        SwapUtil.swapElements(intArray, 1, 3);
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        SwapUtil.swapElements(strArray, 0, 2);
        System.out.println(Arrays.toString(strArray));
    }
}
