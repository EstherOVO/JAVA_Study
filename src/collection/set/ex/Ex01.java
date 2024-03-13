package collection.set.ex;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습문제 1. 고유한 이름 목록 만들기

        다음과 같은 학생들의 이름 목록이 주어졌을 때,
        Set을 사용하여 중복 없이 유일한 이름만 추출하여 리스트 업하는 프로그램을 작성하세요.

        입력 :
        김철수
        이영희
        박지영
        김철수
        박지영
        박민수
        이영희

        출력 :
        김철수
        이영희
        박지영
*/

        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        System.out.println("= 추가할 학생 이름을 입력해 주세요.(종료는 \"종료\" 입력) =");
        while (true) {

            System.out.println("- 이름 : ");
            String name = scanner.next();

            names.add(name);

            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                if (it.next().equals("종료")) {
                    it.remove();
                    System.out.println("최종명단 : " + names);
                    return;
                }
            }
        }
    }
}
