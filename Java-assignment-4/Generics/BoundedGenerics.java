class NumberContainer<T extends Number> {
    private T value;

    public NumberContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class BoundedGenerics {
    public static void main(String[] args) {
        NumberContainer<Integer> intContainer = new NumberContainer<>(10);
        System.out.println(intContainer.getValue());

        NumberContainer<Double> doubleContainer = new NumberContainer<>(5.5);
        System.out.println(doubleContainer.getValue());
    }
}
