package static00.ex;

import java.util.Scanner;

public class BankAccount {

    private static int count;
    private int accountId;
    private int balance;
    private int deposit;
    private int withdraw;

    BankAccount() {
        accountId = ++count;
    }

    public static int allAccount() {
        return count;
    }

    public int getDeposit(int deposit) {
        this.deposit = deposit;
        balance += deposit;
        return balance;
    }

    public int getWithdraw(int withraw) {
        this.withdraw = withraw;
        balance -= withraw;
        return balance;
    }

    public int getBalance() {
        balance = deposit - withdraw;
        return balance;
    }
}
