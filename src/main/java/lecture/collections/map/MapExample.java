package lecture.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String uczen1 = "Jan";
        String uczen2 = "Kasia";
        Integer ocena1 = 4;
        Integer ocena2 = 5;

        // Tworzenie obiektu mapy
        Map<String, Integer> klasa = new HashMap<>();

        //dodawanie elementów do mapy
        klasa.put(uczen1, ocena1);

        //Mapa trzyma unikalne klucze, więc nie można dodać dwoch rekordow ponizej
        klasa.put(uczen1, ocena2);
        klasa.put(uczen1, ocena1);

        //Ten rekord już można dodać
        klasa.put(uczen2, ocena2);

        //Wyswietlanie elementow mapy
        System.out.println(klasa);
        System.out.println("klucze: " + klasa.keySet());
        System.out.println("wartosci: " + klasa.values());

        //usuwanie element z mapy o danym kluczu
        klasa.remove(uczen1);

        //ponowne dodanie ucznia 1
        klasa.put(uczen1, ocena1);

        //pobieranie elementu z mapy o danym kluczu
        System.out.println(klasa.get(uczen2));

        //Wyswietlanie kluczy w inny sposob
        for (String key : klasa.keySet()) {
            System.out.println("Uczen: " + key);
        }

        //Wyswietlanie wartosci w mapie w inny sposob
        for (float value : klasa.values()) {
            System.out.println("Ocena: "+ value);
        }

        //Map.Entry pozwala dzialac na parach klucz-wartosc
        for (Map.Entry<String, Integer> pair : klasa.entrySet()) {
            System.out.println("Uczen - ocena " + pair);
        }

        //Wyświetlanie wszystkich elementów mapy za pomocą lambdy
        klasa.forEach((k, v) -> System.out.println("Klucz: " + k + " Wartość: " + v));

        //Wyświetlanie wszystkich elementów mapy za pomocą lambdy, które mają wartość większą niż 4
        klasa.forEach((k, v) -> {
            if (v > 4) System.out.println("Klucz: " + k + " Wartość: " + v);
        });
    }
}
