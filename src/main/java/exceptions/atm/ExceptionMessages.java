package exceptions.atm;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    NOT_ENOUGH_MONEY_IN_ATM("W bankomacie jest za mało pieniędy, maksymalnie moża wypłacić");

    private final String message;
    ExceptionMessages(String message) {
        this.message = message;
    }
}
