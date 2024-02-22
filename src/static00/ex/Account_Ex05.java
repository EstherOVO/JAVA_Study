package static00.ex;

public class Account_Ex05 {
    public static void main(String[] args) {
/*
        은행 시스템
        계좌 Account 클래스
        필드는
        accountNumber 고유한 계좌번호
        ownerName 소유자 이름
        balance 잔액
        interestRate 불변 고정 이자

        생성자 : 3가지 필드 사용

        메서드 : 필드 내용을 출력하는 정보 출력 메서드
*/

        Account account1 = new Account("홍길동", "123-4567-8910-100", 10000);
        Account account2 = new Account("김자바", "123-4567-8910-200", 20000);

        account1.printAccountInfo();
        account2.printAccountInfo();
    }
}
