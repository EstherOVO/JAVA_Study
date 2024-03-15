package quiz.quiz03_0308.q01;

import java.text.DecimalFormat;

public class BankTransfer implements Payment {
    @Override
    public void pay(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("$ 은행 이체로 " + formatter.format(amount) + "원 결제되었습니다.");
    }
}
