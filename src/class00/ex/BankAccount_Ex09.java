package class00.ex;

import java.util.Scanner;

public class BankAccount_Ex09 {
    public static void main(String[] args) {

/*
        간단한 은행 계좌 관리 시스템 설계
        기능:
        - 입금(deposit): 잔액에 특정 금액을 추가합니다.
        - 출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
        - 잔액 조회(getBalance)
 */

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        System.out.print("계좌번호를 말씀해 주세요(\'-\' 제외) : ");
        long account = scanner.nextLong();

        System.out.print("이름을 입력해 주세요 : ");
        String name = scanner.next();

        System.out.println("===" + name + "님의 계좌 정보입니다." + "===");
        bankAccount.inAndOutputAccountInfo();
    }
}
