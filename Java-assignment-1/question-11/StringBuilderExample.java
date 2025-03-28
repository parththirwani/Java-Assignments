public class StringBuilderExample {
    public void demonstrateStringBuilder() {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // Inserting text
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb);

        // Replacing text
        sb.replace(6, 11, "Java");
        System.out.println("After Replace: " + sb);

        // Deleting text
        sb.delete(5, 6);
        System.out.println("After Delete: " + sb);

        // Reversing text
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}