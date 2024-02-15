package Method;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

/*
        두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
        메서드 이름 : calculate
        예시)
        첫 번째 정수를 입력하세요: 10
        두 번째 정수를 입력하세요: 20
        연산 기호를 입력하세요: +
        연산 결과: 30
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        String firstNumber = scanner.nextLine();
        System.out.print("두 번째 정수 : ");
        String secondNumber = scanner.nextLine();
        System.out.print("연산 기호(\'+\', \'-\', \'*\', \'/\' 중 선택) : ");
        String operation = scanner.nextLine();

        System.out.println("연산 결과 : " + calculate(firstNumber, secondNumber, operation));
    }

    public static String calculate(String x, String y, String z) {

        int x2 = Integer.parseInt(x);
        int y2 = Integer.parseInt(y);

        if (z.equals("+")) {
            int sum = x2 + y2;
            String sum2 = String.valueOf(sum);
            return sum2;
        } else if (z.equals("-")) {
            int sub = x2 - y2;
            String sub2 = String.valueOf(sub);
            return sub2;
        } else if (z.equals("*")) {
            int mul = x2 * y2;
            String mul2 = String.valueOf(mul);
            return mul2;
        } else if (z.equals("/")) {
            int div = x2 / y2;
            String div2 = String.valueOf(div);
            return div2;
        } else {
            String notice = "잘못 입력하셨습니다. 다시 확인해 주세요.";
            return notice;
        }
    }
}
