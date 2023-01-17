package lambda.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,5,7,2,3,78,43,1,6);
        System.out.println("Pierwotna lista liczb: " + numbers);


        Process isEven = new Process() {
            @Override
            public boolean apply(Integer num) {
                return num % 2 == 0;
            }
        };

        System.out.println("Tylko liczby parzyste: " + process(numbers, isEven));
        System.out.println("Tylko liczby większe od 10: " + process(numbers, number -> number > 10));
        System.out.println("Tylko liczby nieparyste:  " + process(numbers, new Process() {
            @Override
            public boolean apply(Integer num) {
                return num % 2 != 0;
            }
        }));
    }

    private static List<Integer> process(List<Integer> numbers, Process process) {
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            if (process.apply(number)) {
                list.add(number);
            }
        }
        return list;
    }
}
