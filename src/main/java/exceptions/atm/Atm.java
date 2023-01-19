package exceptions.atm;

import lombok.Setter;

import static exceptions.atm.ExceptionMessages.NOT_ENOUGH_MONEY_IN_ATM;
import static java.lang.String.format;

@Setter
public class Atm {
    private Double cash;
    private Double capacity = 10000d;

    public Atm(Double cash) {
        this.cash = cash;
    }

    public void makeDeposit(Double amount) {
        if (cash + amount > capacity) {
            var maxDeposit = capacity - cash;
            throw new ToMuchMoneyException(maxDeposit);
        }
        this.cash += amount;
    }

    public void withdraw(Double amount) {
        if (cash - amount <= 0) {
            throw new OutOfMoneyException(format(NOT_ENOUGH_MONEY_IN_ATM.getMessage(), cash));
        }
        cash -= amount;
    }

    public String getBalance() {
        return this.cash.toString();
    }
}
