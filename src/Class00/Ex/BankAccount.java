package Class00.Ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccount {

    long deposit;
    long withdraw;
    long getBalance;

    void inAndOutputAccountInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("§ 입금할 금액을 말씀해 주세요 : ");
        long deposit = scanner.nextLong();

        System.out.print("§ 차감할 금액을 말씀해 주세요 : ");
        long withdraw = scanner.nextLong();

        DecimalFormat fomatter = new DecimalFormat("###,###");
        if (withdraw > deposit) {
            System.out.println("출금할 수 없습니다.");
        } else {
            System.out.println("▶ 현재 잔액은 " + fomatter.format(deposit - withdraw) + "원입니다. ◀");
        }
    }
}
