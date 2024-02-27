package interface00.ex.ex02.ex02_2;

public class Main_Ex02_2 {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(10000);
        BankTransfer bankTransfer = new BankTransfer(20000);
        MobilePay mobilePay = new MobilePay(15000);

        creditCard.pay();
        bankTransfer.pay();
        mobilePay.pay();
    }
}
