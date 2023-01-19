package exceptions.atm;

import static exceptions.atm.ExceptionMessages.TO_MUCH_MONEY_IN_ATM;
import static java.lang.String.format;

public class ToMuchMoneyException extends RuntimeException {

    public ToMuchMoneyException(Double amount) {
        super(format(TO_MUCH_MONEY_IN_ATM.getMessage(), amount));
    }
}
