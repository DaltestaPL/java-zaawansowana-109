package lecture.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        String s1 = "napis";
        String s2 = "napis2";

        String[] strings = new String[10];
        strings[0] = s1;
        strings[1] = s2;
        System.out.println(strings);

        /*
        LISTA
         */
        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.remove(0);
        System.out.println(stringList);

        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("Czy lista zawiera obiekt: " + stringList.contains(s2));
        System.out.println("Czy lista jest pusta: " + stringList.isEmpty());
        System.out.println("Liczba elementów: " + stringList.size());
        //usuwanie wszystkiego z listy
        stringList.clear();

        /*
        LinkedList
         */
        String s3 = "Nowy napis";
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst(s1);
        linkedList.addLast(s2);
        linkedList.add(s3);
        linkedList.addFirst(s3);
        linkedList.remove(1);
        linkedList.remove(s1);
        System.out.println("Pierwszy: " + linkedList.getFirst());
        System.out.println("Ostatni: " + linkedList.getLast());
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
