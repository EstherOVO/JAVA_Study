package interface00.ex.ex02.ex02_2;

public class Main_Ex02_2 {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setAmount(10000);
        paymentProcessor.pay(new CreditCard());

        paymentProcessor.setAmount(20000);
        paymentProcessor.pay(new BankTransfer());

        paymentProcessor.setAmount(15000);
        paymentProcessor.pay(new MobilePay());
    }
}
