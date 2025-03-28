import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String value();
}

class Person {
    @JsonField("first_name")
    String firstName;

    Person(String firstName) {
        this.firstName = firstName;
    }

    String toJson() throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        for (Field field : getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append("\"").append(annotation.value()).append("\":\"").append(field.get(this)).append("\",");
            }
        }
        return json.substring(0, json.length() - 1) + "}";
    }
}
