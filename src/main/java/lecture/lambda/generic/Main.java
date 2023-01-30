package lecture.lambda.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Jarek", "Krzysztof", "Kamila");
        List<Integer> numbers = List.of(1,6,4);

        // Imiona, których liczba liter jest większa od 5:
        System.out.println(process(names, s -> s.length() > 7));

//        Predicate
//        BiConsumer
//        Consumer
//        Comparator
        print(numbers, num -> System.out.println("To jest liczba: " + num));
        print(names, imie -> System.out.println("To jest imie: " + imie));

    }

    private static <E> void print(List<E> numbers, Consumer<E> consumer) {
        for (E num : numbers) {
            consumer.accept(num);
        }
    }

    private static List<String> add(List<String> list, Process<String> process) {
        var result = new ArrayList<String>();
        for (String element : list) {
                result.add(process.apply(element));
        }
        return result;
    }

    private static List<String> process(List<String> list, Process<Boolean> process) {
        var result = new ArrayList<String>();
        for (String element : list) {
            if (process.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
