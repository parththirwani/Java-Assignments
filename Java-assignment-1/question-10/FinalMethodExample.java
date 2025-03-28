class Parent {
    public final void show() { // Final method
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class Child extends Parent {
    // public void show() { } // ❌ This will cause a compilation error (cannot override final method)
}