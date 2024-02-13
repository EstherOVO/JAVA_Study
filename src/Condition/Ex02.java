package Condition;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

/*
        계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월부터 5월까지는 "봄", 6월부터 8월까지는 "여름",
        9월부터 11월까지는 "가을", 12월, 1월, 2월은 "겨울"입니다.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("계절을 알고 싶은 달을 입력해 주세요 : ");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println(month + "월은 겨울입니다.");
        } else if (month >= 3 && month <=5) {
            System.out.println(month + "월은 봄입니다.");
        } else if (month >= 6 && month <=8) {
            System.out.println(month + "월은 여름입니다.");
        } else if (month >= 9 && month <=11) {
            System.out.println(month + "월은 가을입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 시도해 주세요.");
        }

    }
}
