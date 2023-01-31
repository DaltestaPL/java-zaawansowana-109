package lecture.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})
public @interface Sda {

    String group() default "109";
}
