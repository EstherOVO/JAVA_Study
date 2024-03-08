package quiz.quiz03_0308.q1;

import java.text.DecimalFormat;

public class MobilePay implements Payment {
    @Override
    public void pay(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("$ 모바일로 " + formatter.format(amount) + "원 결제되었습니다!");
    }
}
