import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
    String value();
}

class Example {
    @CustomAnnotation("Test Method")
    void test() {}

    public static void main(String[] args) throws Exception {
        Method method = Example.class.getMethod("test");
        CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
        System.out.println(annotation.value());
    }
}
