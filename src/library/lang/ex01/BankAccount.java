package library.lang.ex01;

public class BankAccount {

    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "%s님의 계좌 번호는 %s입니다. 현재 잔액은 %.2f원입니다.".formatted(name, accountNumber, balance);
    }
}
