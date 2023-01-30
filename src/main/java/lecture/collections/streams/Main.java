package lecture.collections.streams;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
//      ----------------------------FILTER---------------------------------------
        List<Integer> integers = List.of(890,345,33,5,53,6,2,1,345);
        System.out.println("Pierwotna lista: " + integers);

        List<Integer> onlyEvenLoop = new ArrayList<>();
        for (Integer i : integers) {
            if (i % 2 == 0)
                onlyEvenLoop.add(i);
        }
        System.out.println("Tylko parzyste pętla: " + onlyEvenLoop);

        var integerStream = integers.stream();
        var onlyEvenStream = integerStream.filter(integer -> integer % 2 == 0).toList();
        System.out.println("Tylko parzyste stream: " + onlyEvenStream);

//      ---------------------------MAP-------------------------------------------
        //lista integer
        List<Integer> integersToMap = List.of(890,345,33,5,53,6,2,1,345);
        //lista stringów za pomocą metody
        var strings = converter(integers);
        //lista stringów za pomocą stream
        var stringsFromStream = integersToMap.stream().map(integer -> String.valueOf(integer)).toList();

//      --------------------------FLAT MAP----------------------------------------
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        var java = new Training("JAVA", List.of(jan, karolina, rozalia));
        var python = new Training("PYTHON", List.of(rozalia, maciej, tomasz));

        var trainings = List.of(java, python);

        //wyciągamy wszystkie imiona osób na szkoleniach
        var names = trainings.stream().flatMap(training -> training.getStudents().stream())
                .map(person -> person.getName()).toList();
        System.out.println("Imiona po flat mapie: " + names);
    }

    private static List<String> converter(List<Integer> integers) {
        var result = new ArrayList<String>();
        for (Integer i : integers) {
            result.add(i.toString());
        }
        return result;
    }
}
