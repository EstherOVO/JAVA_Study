package static00.ex;

import java.text.DecimalFormat;

public class Account {

//  필드
    private String ownerName;
    private final String accountNumber;
    private int balance;
    private static final double interestRate = 0.2;

//  생성자
    public Account(String ownerName, String accountNumber, int balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateRate() {
        double totalBalance;
        totalBalance = balance + (balance * interestRate);
        return totalBalance;
    }

    public void printAccountInfo() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("소유주 : " + ownerName + " | 계좌번호 : " + accountNumber + " | 잔액 : " +
                formatter.format(balance) + "원" + " | 이자 적용 후 잔액 : " + formatter.format(calculateRate()) + "원");
    }
}
