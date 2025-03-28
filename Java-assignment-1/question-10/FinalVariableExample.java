public class FinalVariableExample {
    final int MAX_VALUE = 100; // Final variable (constant)

    public void display() {
        System.out.println("Final Variable: " + MAX_VALUE);
        // MAX_VALUE = 200; // ❌ This will cause a compilation error
    }
}