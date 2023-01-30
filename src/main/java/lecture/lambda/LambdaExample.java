package lecture.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {
        Hospital internist = new Internist();
        internist.treat();
        /*
        Hospital ophthalmologist = new Hospital() {
            @Override
            public void treat() {
                System.out.println("Okulista zaczyna leczyć");
            }

//            @Override
//            public String getDoctorName() {
//                return "Tomek";
//            }
        };
        */
//        ophthalmologist.getDoctorName();

        Hospital ophthalmologist = () -> System.out.println("Okulista zaczyna leczyć");
        ophthalmologist.treat();

        /*
        Doctor doctor = new Doctor() {
            @Override
            public String process(String s) {
                return "Hello doctor " + s + "!";
            }
        };
        */
        Doctor doctor = (s) -> "Hello doctor " + s + "!";

        var greetings = doctor.process("Damian");
        System.out.println(greetings);

        List<String> doctors = List.of("Damian", "Karol", "Matylda", "Tamara");

        /*
        var editedList = editedDoctors(doctors, new Doctor() {
            @Override
            public String process(String s) {
                return s.toUpperCase();
            }
        });
        */

        //Wyrażenie lecture.generic.lambda pozwala na dodanie do każdego lekarza Hello przed imieniem
        var editedList = editedDoctors(doctors, (s) -> "Hello " + s);
        System.out.println(editedList);

        //Wyrażenie lecture.generic.lambda pozwala na zliczneie liczby znaków w imieniu każdego lekarza
        var countedDoctorsList = countedDoctors(doctors, ssdfsdfsdfsfds -> ssdfsdfsdfsfds.length());
        System.out.println(countedDoctorsList);
    }

    private static List<Integer> countedDoctors(List<String> doctors,
                                               IntegerFunctionalInterface functionalInterface) {
        var result = new ArrayList<Integer>();
        for (String d : doctors) {
            result.add(functionalInterface.process(d));
        }
        return result;
    }

    private static List<String> editedDoctors(List<String> doctors, Doctor doctor) {
        var result = new ArrayList<String>();
        for (String name : doctors) {
            result.add(doctor.process(name));
        }
        return result;
    }
}
