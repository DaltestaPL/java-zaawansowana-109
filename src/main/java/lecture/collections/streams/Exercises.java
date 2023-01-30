package lecture.collections.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Exercises {

    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        List<Person> people = List.of(jan, rozalia, karolina, tomasz,maciej);

        //Stwórz nową listę imion, w której nie będzie osób z nazwiskiem na literę K oraz zwrócone zostanie tylko imię
        var filteredNames = people.stream().filter(person -> !person.getSurname().startsWith("K"))
                .map(person -> person.getName()).toList();


        //Jan
        String jan1 = "Jan";
        Integer matemematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matemematyka1, biologia1);
        //Basia
        String basia = "Basia";
        Integer matemematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matemematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan1, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //wyświetlanie za pomocą lambcy klucza i wartości
        classroom.forEach((k, v) -> System.out.println(k + v));

        var result = classroom.entrySet()
                .stream().filter(stringListEntry -> stringListEntry.getKey().equals("Basia")).toList();
    }
}
