package static00.ex;

public class BankAccount_Ex01 {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.getDeposit(10000);
        bankAccount1.getWithdraw(5000);

        System.out.println("계좌 ID : " + BankAccount.allAccount() + " | 잔액 : " + bankAccount1.getBalance());

        BankAccount bankAccount2 = new BankAccount();
        bankAccount1.getDeposit(15000);
        bankAccount1.getWithdraw(5000);
        System.out.println("계좌 ID : " + BankAccount.allAccount() + " | 잔액 : " + bankAccount1.getBalance());

        BankAccount bankAccount3 = new BankAccount();
        bankAccount1.getDeposit(20000);
        bankAccount1.getWithdraw(5000);
        System.out.println("계좌 ID : " + BankAccount.allAccount() + " | 잔액 : " + bankAccount1.getBalance());

        System.out.println("전체 계좌 수 : " + BankAccount.allAccount());
    }
}
