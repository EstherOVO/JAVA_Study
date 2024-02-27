package solid.dip.after;

public class DebitCard implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "원 직불 카드 결제 처리 중...");
    }
}
