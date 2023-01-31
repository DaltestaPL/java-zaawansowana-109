package showroom.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(ExceptionMessages message) {
        super(ExceptionUtil.getExceptionMessage(message.getCode(), message.getMessage()));
    }
}
