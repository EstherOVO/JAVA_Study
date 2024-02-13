package Loop;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

//      이름과 나이를 입력받고 출력하는 애플리케이션
        Scanner scanner = new Scanner(System.in);

        while (true) {

//          이름을 입력받고 (이름을 입력받을 때 'q'라고 입력을 받으면 종료된다.)
            System.out.print("이름을 입력하세요(종료를 원할 시 \'q\'를 입력하세요) : ");
            String userName = scanner.nextLine();

            if (userName.equals("q")) {
                break;
            }

//          나이를 입력받고
            System.out.print("나이를 입력하세요(종료를 원할 시 \'q\'를 입력하세요) : ");
            String userAge = scanner.nextLine();

//          입력받은 이름과 나이를 출력한다.
            if (userAge.equals("q")) {
                break;
            } else {
                System.out.println(userName + "은 " + userAge + "세 입니다.");
            } continue;
        }

    }
}
