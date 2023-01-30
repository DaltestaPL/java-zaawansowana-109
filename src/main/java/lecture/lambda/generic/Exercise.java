package lecture.lambda.generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise {

    public static void main(String[] args) {
        String s = "Imie";
        Integer i = 1;

        process(s, s1 -> System.out.println(s1));
        process(i, s1 -> System.out.println(s1));
        process(new ArrayList<>(), System.out::println);
    }

    private static <E> void process(E s, Consumer<E> consumer) {
        consumer.accept(s);
    }
}
