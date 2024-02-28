package interface00.ex.ex02.ex02_2;

public class PaymentProcessor {

    private Payable payable;

    void setPayable(Payable payable) {
        this.payable = payable;
    }

    void pay() {
        payable.pay();
    }
}
