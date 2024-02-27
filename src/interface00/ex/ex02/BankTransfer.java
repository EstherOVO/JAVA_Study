package interface00.ex.ex02;

import java.text.DecimalFormat;

public class BankTransfer implements Payment {

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("은행 이체로 " + formatter.format(amount) + "원 결제되었습니다.");
    }
}
