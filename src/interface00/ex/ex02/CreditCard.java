package interface00.ex.ex02;

import java.text.DecimalFormat;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("신용카드로 " + formatter.format(amount) + "원 결제되었습니다.");
    }
}
