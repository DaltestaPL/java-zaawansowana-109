package lecture.optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise {

    public static void main(String[] args) {
        String[] tab = new String[]{"Tomek", null, "Jan", null, "Maria", "Julia", "Robert"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tab));

        Integer[] integers = new Integer[]{234,436,676,86,978,96};
        List<Integer> integersList = new ArrayList<>(Arrays.asList(integers));

        stringList.forEach(s -> findNull(s));
        stringList.forEach(s -> check(s));

        integersList.forEach(i -> findNull(i));
        integersList.forEach(integer -> check(integer));
    }

    private static <T> void findNull(T s) {
        var optional = Optional.ofNullable(s);
        if (optional.isEmpty())
            System.out.println("Znalazłem null");
    }

    private static <T> void check(T s) {
        var optional = Optional.ofNullable(s);
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("Znalazłem null");
    }
}
