import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    int times();
}

class Example {
    @Execute(times = 3)
    void run() {
        System.out.println("Executing method...");
    }

    public static void main(String[] args) throws Exception {
        Example example = new Example();
        for (Method method : Example.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Execute.class)) {
                int times = method.getAnnotation(Execute.class).times();
                for (int i = 0; i < times; i++) {
                    method.invoke(example);
                }
            }
        }
    }
}
