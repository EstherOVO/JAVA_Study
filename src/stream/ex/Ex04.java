package stream.ex;

import javax.swing.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Ex04 {
    public static void main(String[] args) {

/*
    문제 4. 영화 평점 요약

    영화와 그에 대한 평점이 주어졌을 때,
    평점이 8 이상인 영화의 이름을 추출하고,
    "영화명 - 평점" 형태로 변환한 후 결과를 출력하세요.

    Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption", 9, "The Godfather", 9, "The Dark Knight", 8, "Pulp Fiction", 8, "Fight Club", 7);

    출력 결과:
    The Shawshank Redemption - 9
    The Godfather - 9
    The Dark Knight - 8
    Pulp Fiction - 8
*/

        Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption", 9, "The Godfather", 9, "The Dark Knight", 8, "Pulp Fiction", 8, "Fight Club", 7);

        List<String> list = movieRatings.entrySet().stream()
                .filter(entry -> entry.getValue() >= 8)
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .toList();

        list.forEach(System.out::println);
    }
}
