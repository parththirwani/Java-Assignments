class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class KeyValue {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Alice", 90);
        System.out.println(student.getKey() + ": " + student.getValue());
    }
}
