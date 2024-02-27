package solid.dip.before;

// DIP 적용 전
public class CreditCard {

    void processPayment(double amount) {
        System.out.println(amount + "원 신용 카드 결제 처리 중...");
    }
}
