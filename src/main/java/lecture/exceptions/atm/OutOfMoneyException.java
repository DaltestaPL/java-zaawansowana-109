package lecture.exceptions.atm;

public class OutOfMoneyException extends RuntimeException {

    public OutOfMoneyException(String message) {
        super(message);
    }
}
