package lecture.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String empty = null;
        //.ofNullable() używamy gdy w optional może być null
        Optional<String> stringOptional = Optional.ofNullable(empty);

        if(stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String name = "Tomek";
        //.of() używamy gdy w optionalu nie ma null
        Optional<String> nameOptional = Optional.of(name);

        //.orElse() jeśli optional przechowuje null wtedy da nam obiekt z tej metody
        //obiekt w orElse() zawsze zostanie stworzony
        var name1 = nameOptional.orElse("Kamil");
        System.out.println(".orElse(): " + name1);

        //.orElseGet()
        //jeśli obiekt w optional nie jest null to orEleGet() nie stworzy obiektu String "Kamil"
        var name3 = nameOptional.orElseGet(() -> "Kamil");
        System.out.println(".orElseGet(): " + name3);

        //.orElseThrow
        nameOptional.orElseThrow(() -> new RuntimeException("W name optionalu nic nie było"));
        stringOptional.orElseThrow(() -> new RuntimeException("W string optionalu nic nie było"));

    }
}
