package collection.list.ex.ex04_2;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {

    Map<String, Integer> map = new LinkedHashMap<>();

    public VotingSystem() {
        map.put("고길동", 0);
        map.put("둘리", 0);
        map.put("도우너", 0);
        map.put("마이콜", 0);
        map.put("희동이", 0);
    }

    public void startVoting() {

        System.out.print("""
                ━ 후보 목록 ━
                기호 1번 : 고길동
                기호 2번 : 둘리
                기호 3번 : 도우너
                기호 4번 : 마이콜
                기호 5번 : 희동이
                ※ 종료는 \'0\'번을 입력해 주세요.
                """);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println();
                System.out.println("= 원하는 후보에게 투표해 주세요! =");
                System.out.print("▣ 투표 번호 : ");
                int number = scanner.nextInt();

                validateNumber(number);

                switch (number) {
                    case 1 :
                        map.replace("고길동", map.get("고길동") + 1);
                        continue;
                    case 2 :
                        map.replace("둘리", map.get("둘리") + 1);
                        continue;
                    case 3 :
                        map.replace("도우너", map.get("도우너") + 1);
                        continue;
                    case 4 :
                        map.replace("마이콜", map.get("마이콜") + 1);
                        continue;
                    case 5 :
                        map.replace("희동이", map.get("희동이") + 1);
                        continue;
                    case 0 :
                        printResult();
                        System.out.println("투표를 종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printResult() {

        int votes = 0;
        String electedPerson = "";

//      map.forEach((key, value) -> System.out.println(key + " : " + value));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "표");
            if (votes < entry.getValue()) {
                votes = entry.getValue();
                electedPerson = entry.getKey();
            }
        }
        System.out.println(String.format("* 총 %d표로 %s님이 당선되었습니다! *", votes, electedPerson));
    }

    public void validateNumber(int number) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (number < 0 || number > map.size()) {
            exceptionMessage.append("기호 번호를 확인 후 입력해 주세요.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
