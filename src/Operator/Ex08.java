package Operator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

//      삼항 연산자
//      사용자로부터 두 정수를 입력받아, 두 정수 중 큰 값을 출력하는 프로그램을 작성하세요.
//      이때, 조건 연산자(삼항 연산자)를 사용하여 구현하세요.

//      TIP! 활용해 보세요.
//      Scanner scanner = new Scanner(System.in);
//      int first = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a : ");
        int first = scanner.nextInt();

        System.out.print("정수 b : ");
        int second = scanner.nextInt();

        scanner.close();

        String result = (first > second) ? ("정수 a" + "(" + first + ")") : ("정수 b" + "(" + second + ")");
        System.out.println("더 큰 값 : " + result);

    }
}
