package exceptions.atm;

public class AtmApp {

    private static final Atm ATM = new Atm(1000d);

    public static void main(String[] args) {
        handleWithdraw(2000d);
    }

    public static void handleWithdraw(Double amount) {
        try {
            ATM.withdraw(amount);
        }
        catch (OutOfMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
