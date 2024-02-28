package interface00.ex.ex02.ex02_2;

public class PaymentProcessor {

    private Payable payable;
    private int amount;

    void setAmount(int amount) {
        this.amount = amount;
    }

    void pay(Payable payable) {
        payable.pay(amount);
    }
}
