class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class Generics {
    public static void main(String[] args) {
        GenericClass<String> strObj = new GenericClass<>("Hello");
        System.out.println(strObj.getData());

        GenericClass<Integer> intObj = new GenericClass<>(100);
        System.out.println(intObj.getData());
    }
}
