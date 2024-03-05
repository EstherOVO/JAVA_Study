package library.lang.ex.ex01;

public class Ex01 {
    public static void main(String[] args) {

/*
        은행 계좌 정보를 관리하는 BankAccount 클래스가 있다고 가정해 보겠습니다.
        계좌 번호와 소유자 이름, 현재 잔액을 포함하는 toString() 메소드를 오버라이드 하여 구현할 수 있습니다.
*/

        BankAccount bankAccount = new BankAccount("123-4567-8910-11", "김자바", 10000);
        System.out.println(bankAccount);
    }
}
