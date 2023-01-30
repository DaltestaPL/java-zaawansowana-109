package lecture.exceptions;

class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    private static void throwException() {
        throw new RuntimeException("Błąd");
    }

}
