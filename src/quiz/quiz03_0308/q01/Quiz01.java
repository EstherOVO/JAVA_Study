package quiz.quiz03_0308.q01;

public class Quiz01 {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setPayment(new CreditCard(), 10000);
        paymentProcessor.setPayment(new BankTransfer(), 20000);
        paymentProcessor.setPayment(new MobilePay(), 30000);
    }
}
