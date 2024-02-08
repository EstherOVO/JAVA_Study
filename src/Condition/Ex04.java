package Condition;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

         /*
         간단한 계산기 만들기
//        사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아,
        해당 연산을 수행한 결과를 출력하는 간단한 계산기 프로그램을 작성하세요.
        switch 문을 사용하여 각 연산자에 따른 연산을 처리하세요.
        0으로 나누기 시도시 "0으로 나눌 수 없습니다."와 같은 오류 메시지를 출력하세요.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        double first = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double second = scanner.nextDouble();

        System.out.print("연산자를 입력하세요('+', '-', '*', '/' 중 입력) : ");
        String operator = scanner.next();

        scanner.close();

        switch (operator) {
            case "+" :
                System.out.println(first + second);
                break;
            case "-" :
                System.out.println(first - second);
                break;
            case "*" :
                System.out.println(first * second);
                break;
            case "/" :
                System.out.println(first / second);
                break;
        }

        if (first == 0 && operator.equals("/")) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        if (second == 0 && operator.equals("/")) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}
