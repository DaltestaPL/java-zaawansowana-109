package lecture.lambda;

@FunctionalInterface
public interface Hospital {
    void treat();
    default String processDefault() {
        return "Hej!";
    }

//    Interfejs funkcjonalny nie może mieć więcej metod, chyba że default method
//    String getDoctorName();
}
