package lecture.lambda;

public class Internist implements Hospital {
    @Override
    public void treat() {
        System.out.println("Internista zaczyna leczyć");
    }

//    @Override
//    public String getDoctorName() {
//        return null;
//    }
}
