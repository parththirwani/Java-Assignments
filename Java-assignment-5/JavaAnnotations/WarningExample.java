import java.util.ArrayList;

public class WarningExample {
    @SuppressWarnings("unchecked")
    void method() {
        ArrayList list = new ArrayList();
        list.add("test");
    }
}
