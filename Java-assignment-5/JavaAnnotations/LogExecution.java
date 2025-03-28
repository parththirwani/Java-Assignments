import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Example {
    @LogExecutionTime
    void process() throws InterruptedException {
        Thread.sleep(500);
    }

    public static void main(String[] args) throws Exception {
        Example example = new Example();
        for (Method method : Example.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.currentTimeMillis();
                method.invoke(example);
                long end = System.currentTimeMillis();
                System.out.println(method.getName() + " executed in " + (end - start) + "ms");
            }
        }
    }
}
