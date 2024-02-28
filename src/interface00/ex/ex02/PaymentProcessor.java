package interface00.ex.ex02;

public class PaymentProcessor {

    public void payment(Payment payment, double amount) {
        payment.pay(amount);
    }
}
