class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Boxes {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(100);
        System.out.println(intBox.getItem());
    }
}
