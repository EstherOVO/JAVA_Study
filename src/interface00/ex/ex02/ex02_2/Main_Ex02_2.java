package interface00.ex.ex02.ex02_2;

public class Main_Ex02_2 {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payable creditCard = new CreditCard(10000);
        Payable bankTransfer = new BankTransfer(20000);
        Payable mobilePay = new MobilePay(15000);

        paymentProcessor.setPayable(creditCard);
        paymentProcessor.pay();

        paymentProcessor.setPayable(bankTransfer);
        paymentProcessor.pay();

        paymentProcessor.setPayable(mobilePay);
        paymentProcessor.pay();
    }
}
