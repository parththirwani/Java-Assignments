import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class Example {}

public class Reflections{
    public static void main(String[] args) {
        Class<Example> obj = Example.class;
        if (obj.isAnnotationPresent(Author.class)) {
            Author annotation = obj.getAnnotation(Author.class);
            System.out.println("Author: " + annotation.name());
        }
    }
}
