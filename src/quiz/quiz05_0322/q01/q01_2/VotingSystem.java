package quiz.quiz05_0322.q01.q01_2;

import java.util.*;

public class VotingSystem {

    Map<String, Integer> voteMap = new LinkedHashMap<>();

    public VotingSystem() {
        voteMap.put("고길동", 0);
        voteMap.put("둘리", 0);
        voteMap.put("마이콜", 0);
        voteMap.put("희동이", 0);
    }

    public void startVote() {

        System.out.println("""
                ■ 후보 목록 ■
                기호 1번. 고길동
                기호 2번. 둘리
                기호 3번. 마이콜
                기호 4번. 희동이
                (※ 종료는 \"0\"을 입력해 주세요.)
                
                ▣ 투표하고 싶은 후보의 번호를 입력해 주세요
                """);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.print("- 번호 : ");
                int number = scanner.nextInt();

                validateNumber(number);

                switch (number) {
                    case 1 :
                        voteMap.replace("고길동", voteMap.get("고길동") + 1);
                        break;
                    case 2 :
                        voteMap.replace("둘리", voteMap.get("둘리") + 1);
                        break;
                    case 3 :
                        voteMap.replace("마이콜", voteMap.get("마이콜") + 1);
                        break;
                    case 4 :
                        voteMap.replace("희동이", voteMap.get("희동이") + 1);
                        break;
                    case 0 :
                        System.out.println("투표가 종료되었습니다.");
                        printResult();
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

        voteMap.forEach((key, value) -> System.out.println(String.format("□ %s : %d표", key, value)));

        int votes = 0;
        String electedPerson = "";

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (votes < entry.getValue()) {
                votes = entry.getValue();
                electedPerson = entry.getKey();
            }
        }

        System.out.println("☆ 총 %d표로 %s님이 당선되었습니다. 축하합니다! ☆".formatted(votes, electedPerson));
    }

    public void validateNumber(int number) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (number < 0 || number > voteMap.size()) {
            exceptionMessage.append("번호를 확인해 주시기를 바랍니다.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
