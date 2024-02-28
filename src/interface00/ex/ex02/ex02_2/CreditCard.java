package interface00.ex.ex02.ex02_2;

import java.text.DecimalFormat;

public class CreditCard implements Payable {

    @Override
    public void pay(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println(formatter.format(amount) + "원을 신용 카드로 결제합니다.");
    }
}
