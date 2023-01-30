package lecture.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = prepare(1000);
        var result = executeTasks(numbers);

        System.out.println("Przetworzono: " + result.size() + " liczb");
        var evens = result.stream().filter(f -> {
            try {
                return f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        System.out.println("Parzystych liczb: " + evens.size());

        AtomicReference<Integer> oddCount = new AtomicReference<>(0);
        result.stream().filter(f -> {
            Boolean isEven;
            try {
                isEven = f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            if (!isEven) {
                oddCount.getAndSet(oddCount.get() + 1);
            }
            return isEven;
        }).toList();
        System.out.println("Nieparzystych liczb: " + oddCount);
    }

    private static List<Future<Boolean>> executeTasks(List<Integer> numbers) throws InterruptedException {
        List<Callable<Boolean>> tasks = new ArrayList<>();
        for (Integer num : numbers) {
            tasks.add(createTask(num));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Boolean>> result = executorService.invokeAll(tasks);
        executorService.shutdown();
        return result;
    }

    private static Callable<Boolean> createTask(Integer number) {
        return () -> {
            if (isEven(number)) {
                System.out.println("Liczba parzysta! " + number);
                return true;
            }
            return false;
        };
    }

    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    private static List<Integer> prepare(int range) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            numbers.add((int) (Math.random() * (range * 10)));
        }
        return numbers;
    }
}


//    private Callable<Integer> createTask(Integer number) {
//        return new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                if (isEven(number)) {
//                    System.out.println("Liczba parzysta! " + number);
//                }
//                return null;
//            }
//        };
//    }