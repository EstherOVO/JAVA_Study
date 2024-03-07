package exception.ex.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

/*
    연습문제 5 : 비밀번호 검증 시스템

    요구사항 :
    1. 사용자로부터 비밀번호를 입력받습니다.
    2. 입력받은 비밀번호가 요구사항을 충족하는지 검증합니다.
    - 최소 8자 이상
    - 최소 하나의 숫자 포함
    - 최소 하나의 대문자 포함
    - 요구사항을 충족하지 않는 경우, 적절한 사용자 정의 예외를 발생시키고 다음과 같은 오류 메시지를 출력합니다:
*/
        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("설정하실 비밀번호를 입력하세요 : ");
                String password = scanner.next();

                validatePassword(password);

                System.out.println("비밀번호가 설정되었습니다.");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validatePassword(String password) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (password.length() < 8) {
            exceptionMessage.append("비밀번호는 최소 8자 이상이어야 합니다.\n");
//          1. System.out.println(exceptionMessage.append("비밀번호는 최소 8자 이상이어야 합니다.")); → 이하 "비이"
        }

        if (!password.matches(".*[0-9].*")) {
            exceptionMessage.append("비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.\n");
//          2. System.out.println(exceptionMessage.append("비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.\n")); → 이하 "비숫"
        }

        if (!password.matches(".*[A-Z].*")) {
            exceptionMessage.append("비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.\n");
//          3. System.out.println(exceptionMessage.append("비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.\n")); → 이하 "비대"
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
/*
    - 입력값 : password
    - 출력화면 :
    "비밀번호에는 최소 하나의 숫자가 포함되어야 합니다."

    "비밀번호에는 최소 하나의 숫자가 포함되어야 합니다."
    "비밀번호에는 최소 하나의 대문자가 포함되어야 합니다."

    "비밀번호에는 최소 하나의 숫자가 포함되어야 합니다."
    "비밀번호에는 최소 하나의 대문자가 포함되어야 합니다."

    - 이유 :
    만약 위와 같이 하지 않고 1번 ~ 3번과 같이 작성을 했다면 StringBuilder의 exceptionMessage 상자 안에
    "비숫"가 저장되고, println으로 인해 우선 "비숫"이 한 번 출력된다.
    그러고 나서 "비대"가 exceptionMessage 상자 안에 저장이 되고, 더 이상 if 해당이 없기 때문에
    exceptionMessage 상자 안의 "비숫"과 "비대"가 출력된다.
    그러나 throw new IllegalArgumentException(exceptionMessage.toString());으로 인해
    한 번 더 "비숫"과 "비대"가 출력된다.

    따라서 System.out.println은 빼야 한다.
*/

}
