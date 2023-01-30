package threads;

import java.util.ArrayList;
import java.util.List;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        List<Integer> numbers = prepare(1000);


        System.out.println(numbers);
    }


    private static List<Integer> prepare(int range) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            numbers.add((int)(Math.random() * (range * 10)));
        }
        return numbers;
    }
}
