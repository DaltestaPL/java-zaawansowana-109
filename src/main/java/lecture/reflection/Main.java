package lecture.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person person = new Person("Tomek");
        System.out.println(person);
        Class<?> cl = Class.forName("lecture.reflection.Person");
        System.out.println(cl.getName());
        System.out.println(Arrays.toString(cl.getConstructors()));
        Constructor<?> constructor = cl.getConstructors()[0];
        var o = constructor.newInstance("Julia");
        System.out.println(o);

        System.out.println(Arrays.toString(cl.getAnnotations()));
    }
}
