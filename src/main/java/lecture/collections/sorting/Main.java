package lecture.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        //-------------SORTOWANIE - COLLECTIONS---------------------------------
        List<Integer> integers = new ArrayList<>(List.of(1,4,5,7,8,4356,8,9,87));
        System.out.println("Lista bez sortu: " + integers);
        Collections.sort(integers);
        System.out.println("Lista posortowana" + integers);
        Collections.reverse(integers);
        System.out.println("Lista posortowana odwrotnie" + integers);

        //______SORTOWANIE - COMPARATOR------------------------------------------
        Integer num = 5;
        Integer num2 = 5;
        Integer bigger = 10;

        System.out.println("Mniejsza porównana do większej: " + num.compareTo(bigger)); // -1
        System.out.println("Większa porównana do mniejszej: " + bigger.compareTo(num));// 1
        System.out.println("Liczby są równe: " + num2.compareTo(num));// 0

        List<Integer> listForComparing = new ArrayList<>(List.of(1,4,5,7,8,4356,8,9,87));
        System.out.println("Lista bez sortu: " + listForComparing);
        listForComparing.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Lista posortowana rosnąco" + listForComparing);
        //lecture.generic.lambda
        listForComparing.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("Lista posortowana malejąco" + listForComparing);
        //method reference
        listForComparing.sort(Integer::compareTo);
        System.out.println("Lista posortowana rosnąco" + listForComparing);
        //Comparator
        listForComparing.sort(Comparator.reverseOrder());
        System.out.println("Lista posortowana malejąco" + listForComparing);

        //Porównywanie stringów
        List<String> stringList = new ArrayList<>(List.of("Karol", "Adam", "Zygmunt", "Celina"));
        System.out.println("Nieposortowana lista: " + stringList);
        stringList.sort(String::compareTo);
        System.out.println("Posortowana lista: " + stringList);

        //Porównywanie po polach w klasach
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Kaczmarek");
        Person jadwiga = new Person("Jadwiga", "Skudro");

        List<Person> people = new ArrayList<>(List.of(jan, karolina, jadwiga));
        System.out.println("Nieposortowana lista osób: " + people);
        people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Posortowana lista po imionach: " + people);
        people.sort((o1, o2) -> (o1.getName() + o1.getSurname()).compareTo(o2.getName() + o2.getSurname()));
        System.out.println("Posortowana lista po imieniu z nazwiskiem: " + people);
    }
}
