package access_modifier.ex.bank.system;

public class Account {

    private double balance;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        System.out.println("출금 시도 : " + amount);
        balance -= amount;
        if (balance < amount) {
            System.out.println("출금액이 잔액을 초과하였습니다. 다시 시도해 주시기를 바랍니다.");
        } else if (balance > amount) {
            return balance;
        }
        return balance;
    }

    public double getInstance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
