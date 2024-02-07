package Variable;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

/*      Scanner를 이용해서 변수에 입력을 받고 출력하는 코드를 작성하라.
        1. 이름: ________ (ENTER)
        2. 주민번호앞자리: _______ (ENTER)
        3. 전화번호: ______ (ENTER)
*/

        /* Scanner scanner = new Scanner(System.in);   // 키보드에 입력된 내용을 문자열로 얻기
        String line = scanner.nextLine();

        System.out.println(line); */

        Scanner sc = new Scanner(System.in);

        System.out.print("1. 이름 : ");
        String name = sc.nextLine();

        System.out.print("2. 주민등록번호 앞자리(6자리) : ");
        String resident = sc.nextLine();

        System.out.print("3. 전화번호 : ");
        String number = sc.nextLine();

        sc.close();

    }
}
