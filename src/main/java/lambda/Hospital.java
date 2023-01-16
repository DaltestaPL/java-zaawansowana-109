package lambda;

@FunctionalInterface
public interface Hospital {
    void treat();

//    Interfejs funkcjonalny nie może mieć więcej metod, chyba że default method
//    String getDoctorName();
}
