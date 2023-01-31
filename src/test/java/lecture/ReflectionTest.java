package lecture;

import lecture.reflection.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectionTest {

    Person person = new Person("Tomek");

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(person);

        Field age = person.getClass().getField("age");
        age.setAccessible(true);

        age.setInt(person, 25);

        System.out.println(person);
    }
}
