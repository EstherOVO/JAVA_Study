package Variable;

import java.io.IOException;
import java.util.Scanner;

public class Read01 {
    public static void main(String[] args) throws IOException {

        int read = System.in.read();    // "시스템 입력 장치에서 키를 읽어라."는 의미로 읽은 결과는 KeyCode로 저장된다.

        System.out.println(read);       // 아스키 코드(ASCII)로 출력

        Scanner scanner = new Scanner(System.in);   // 키보드에 입력된 내용을 문자열로 얻기
        String line = scanner.nextLine();

        System.out.println(line);

    }
}
