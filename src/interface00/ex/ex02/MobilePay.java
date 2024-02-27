package interface00.ex.ex02;

import java.text.DecimalFormat;

public class MobilePay implements Payment {

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("모바일 결제로 " + formatter.format(amount) + "원 결제되었습니다.");
    }
}
