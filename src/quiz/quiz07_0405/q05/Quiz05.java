package quiz.quiz07_0405.q05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("▥ 경로를 입력해 주세요 : ");
        String strPath = scanner.nextLine();

        Path path = Paths.get(strPath);

        try {

            long totalSize = Files.walk(path)
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(p -> p.toFile().length())
                    .sum();

            System.out.println("□ 디렉토리 내의 모든 파일의 크기 : %,d Byte".formatted(totalSize));
        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
