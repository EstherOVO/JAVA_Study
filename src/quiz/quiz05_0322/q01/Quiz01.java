package quiz.quiz05_0322.q01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {

        List<String> cadidatesList = new ArrayList<>();
        List<Integer> votesList = new ArrayList<>();

        cadidatesList.add("고길동");
        cadidatesList.add("둘리");
        cadidatesList.add("마이콜");
        cadidatesList.add("희동이");

        for (int i = 0; i < cadidatesList.size(); i++) {
            votesList.add(0);
        }

        for (int i = 0; i < cadidatesList.size(); i++) {
            System.out.println("(" + (i + 1) + "번) " + cadidatesList.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("투표하고 싶은 후보의 번호를 입력해 주세요 : ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0 && number <= cadidatesList.size()) {
                Integer vote = votesList.get(number - 1);
                votesList.set(number - 1, vote + 1);
            } else {
                System.out.println("번호를 확인해 주시기를 바랍니다.");
            }
        }

        System.out.println("= 투표 결과 =");
        for (int i = 0; i < cadidatesList.size(); i++) {
            System.out.println(String.format("%s 후보 : %d표", cadidatesList.get(i), votesList.get(i)));
        }
    }
}
