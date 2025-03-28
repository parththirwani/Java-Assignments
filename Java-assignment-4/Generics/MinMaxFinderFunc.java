import java.util.List;
import java.util.Arrays;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> elements;

    public MinMaxFinder(List<T> elements) {
        this.elements = elements;
    }

    public T findMin() {
        return elements.stream().min(T::compareTo).orElse(null);
    }

    public T findMax() {
        return elements.stream().max(T::compareTo).orElse(null);
    }
}

public class MinMaxFinderFunc {
    public static void main(String[] args) {
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(Arrays.asList(10, 5, 30, 2, 18));
        System.out.println("Min: " + intFinder.findMin());
        System.out.println("Max: " + intFinder.findMax());

        MinMaxFinder<String> strFinder = new MinMaxFinder<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Min: " + strFinder.findMin());
        System.out.println("Max: " + strFinder.findMax());
    }
}
