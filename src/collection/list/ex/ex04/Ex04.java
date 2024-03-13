package collection.list.ex.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        List<String> candidates = new ArrayList<>();    // 후보 정보
        List<Integer> votes = new ArrayList<>();        // 받은 투표 수

//      후보 목록 등록(초기화)
        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

//      받은 투표 수 초기화
        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }

//      후보 목록 출력하기
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println("기호 " + (i + 1) + "번 " + candidates.get(i));
        }

//      투표 받기
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("= 투표하고 싶은 후보의 번호를 입력하세요. =");
            System.out.print("번호 ▶ ");
            int number = scanner.nextInt();

//          0이면 투표 종료하기

            if (number == 0) {
                break;
            } else if (number > 0 && number < candidates.size()){
//              투표 카운트하기
                Integer vote = votes.get(number - 1);   // 투표 수 가져오기(인덱스 주의)
                votes.set(number - 1, vote + 1);
            } else {
                System.out.println("번호를 확인 후 입력해 주세요.");
            }
        }

//      반복문 빠져나올 시 투표 결과 출력
        System.out.println("= 투표 결과 =");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(String.format("%s : %d표", candidates.get(i), votes.get(i)));
        }
    }
}
