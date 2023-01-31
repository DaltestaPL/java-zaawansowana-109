package showroom.exceptions;

public class BadObjectException extends RuntimeException {
    public BadObjectException(ExceptionMessages message) {
        super(ExceptionUtil.getExceptionMessage(message.getCode(), message.getMessage()));
    }
}
