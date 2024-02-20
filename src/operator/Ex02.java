package operator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

//      논리 연산자
//      사용자로부터 두 개의 불리언 값을 입력받습니다.
//      이 두 값에 대해 AND, OR, NOT 연산을 수행하고
//      각 결과를 출력하는 프로그램을 작성하세요.

//      TIP! 활용해 보세요.
//      Scanner scanner = new Scanner(System.in);
//      scanner.nextBoolean(); → 입력받은 변수를 불리언 값으로 저장

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 값 입력해 주세요. (true or false) : ");
        boolean b1 = scanner.nextBoolean();

        System.out.print("두 번째 값 입력해 주세요. (true or false) : ");
        boolean b2 = scanner.nextBoolean();

        scanner.close();

        System.out.println("AND 연산 : " + (b1 && b2));
        System.out.println("OR 연산 : " + (b1 || b2));
        System.out.println("NOT 연산 : " + "\n- 첫 번째 값 : " + (!b1) + "\n- 두 번째 값 : " + (!b2));

    }
}
