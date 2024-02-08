package Condition;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

 /* 계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월부터 5월까지는 "봄", 6월부터 8월까지는 "여름",
        9월부터 11월까지는 "가을", 12월, 1월, 2월은 "겨울"입니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("어느 달의 계절이 궁금하신가요?");
        int result = scanner.nextInt();

        scanner.close();

        int season = result;

        if (season >= 1 && season < 3) {
            System.out.println(season + "월은 " + "\'겨울\'입니다.");
        } else if (season >= 3 && season <=5) {
            System.out.println(season + "월은 " + "\'봄\'입니다.");
        } else if (season >= 6 && season <= 8) {
            System.out.println(season + "월은 " + "\'여름\'입니다.");
        } else if (season >= 9 && season <= 12) {
            System.out.println(season + "월은 " + "\'가을\'입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 시도해 주세요.");
        }

    }
}
