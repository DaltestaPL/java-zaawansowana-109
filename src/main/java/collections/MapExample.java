package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String uczen1 = "Jan";
        String uczen2 = "Kasia";
        Integer ocena1 = 4;
        Integer ocena2 = 5;

        Map<String, Integer> klasa = new HashMap<>();
        klasa.put(uczen1, ocena1);
        klasa.put(uczen1, ocena2);
        klasa.put(uczen1, ocena1);
        klasa.put(uczen2, ocena2);
        System.out.println(klasa);
        System.out.println("klucze: " + klasa.keySet());
        System.out.println("wartosci: " + klasa.values());

    }
}
