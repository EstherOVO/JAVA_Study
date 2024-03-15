package quiz.quiz03_0308.q01;

import java.text.DecimalFormat;

public class CreditCard implements Payment {
    @Override
    public void pay(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("$ 신용카드로 " + formatter.format(amount) + "원 결제되었습니다.");
    }
}
