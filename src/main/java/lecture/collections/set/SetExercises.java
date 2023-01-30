package lecture.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercises {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomek");
        stringList.add("Janina");
        stringList.add("Janina");
        stringList.add("Barbara");
        stringList.add("Barbara");

        removeDuplicates(stringList);

        System.out.println(stringList);
    }

    private static void removeDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
