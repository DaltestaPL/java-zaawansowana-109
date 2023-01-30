package lecture.threads;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var names = List.of("Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan","Tomek", "Adam", "Maria", "Julia", "Kamil", "Jan");
        String hi = "Cześć! ";

        for (int i = 0; i < names.size(); i=i+2) {
            var thread0 = new SDAThread(hi + names.get(i));
            var thread1 = new SDAThread(hi + names.get(i+1));
            thread0.start();
            thread1.start();
        }
    }
}
