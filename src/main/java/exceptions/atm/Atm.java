package exceptions.atm;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
public class Atm {
    private Double cash;
    private Double capacity = 10000d;

    public Atm(Double cash) {
        this.cash = cash;
    }

    public void makeDeposit(Double amount) {
        this.cash += amount;
    }

    public void withdraw(Double amount) {
        if (cash - amount <= 0) {
            throw new OutOfMoneyException(ExceptionMessages.NOT_ENOUGH_MONEY_IN_ATM.getMessage());
        }
        cash -= amount;
    }

    public String getBalance() {
        return this.cash.toString();
    }
}
