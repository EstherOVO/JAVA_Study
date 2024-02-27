package interface00.ex.ex02;

public class PaymentProcessor {

    private Payment payment;

    public void payment(Payment payment, double amount) {
        payment.pay(amount);
    }
}
