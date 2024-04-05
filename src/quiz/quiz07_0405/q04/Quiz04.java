package quiz.quiz07_0405.q04;

import java.io.*;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("§ 저장하고 싶은 문자열을 입력해 주세요.(종료는 \"종료\" 입력)");

        try (Writer writer = new FileWriter("src/quiz/quiz07_0405/q04/output.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {

            while (true) {

                System.out.print("- 입력 : ");
                String str = scanner.nextLine();

                if (str.equals("종료")) {
                    System.out.println("~ 프로그램을 종료합니다. ~");
                    return;
                }

                bw.write(str);
                bw.newLine();

                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
