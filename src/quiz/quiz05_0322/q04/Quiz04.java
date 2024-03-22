package quiz.quiz05_0322.q04;

import java.util.*;

public class Quiz04 {
    public static void main(String[] args) {

        List<String> luggage = new ArrayList<>();

        luggage.addAll(Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷"));

        System.out.println("◎ 원본 물품 리스트 : " + luggage);

        Collections.sort(luggage);
        System.out.println("◎ 정렬 후 물품 리스트 : " + luggage);

        Collections.reverse(luggage);
        System.out.println("◎ 뒤집 후 물품 리스트 : " + luggage);

        Collections.shuffle(luggage);
        System.out.println("◎ 셔플 후 물품 리스트 : " + luggage);

        luggage.addAll(Arrays.asList("휴대폰", "카메라", "책"));
        System.out.println("◎ 물품 추가 후 리스트 : " + luggage);

        int frequency1 = Collections.frequency(luggage, "책");
        System.out.println("◎ \"책\"의 빈도수 : " + frequency1 + "번");

        Set<String> newLuggage = new HashSet<>();
        newLuggage.addAll(luggage);
        System.out.println("◎ 중복 제거 후 물품 리스트 : " + newLuggage);

        int frequency2 = Collections.frequency(newLuggage, "책");
        System.out.println("◎ \"책\"의 빈도수 : " + frequency2 + "번");

        String min = Collections.min(newLuggage);
        System.out.println("◎ 가장 중요한 물품 : " + min);
    }
}
