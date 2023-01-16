package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista zadania
 */
public class ListExercises {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);

        System.out.println(findEvenNumbers(numbers));
    }

    /**
     * Napisz ciało metody zwracającej nową listę zawierającą jedynie liczby parzyste
     */
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        List<Integer> listOut = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                listOut.add(number);
        }
        return listOut;
    }

//    public static List<Integer> findEvenNumbers (List<Integer> numbers){
//        List<Integer> listOut = new ArrayList<>();
//        for( int i = 0;i<numbers.size(); i++){
//            if ((numbers.get(i) % 2)==0) {
//                listOut.add(numbers.get(i));
//            }
//        }
//        return listOut;
//    }
}
