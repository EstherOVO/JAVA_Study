package stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex13 {
    public static void main(String[] args) {

/*
        문제 13. 도시별 인구 수 집계하기

        여러 도시의 인구 정보가 다음과 같이 주어져 있습니다.
        각 도시의 평균 인구수를 계산하세요.

        record CityPopulation(String city, int population) {}

        List<CityPopulation> cityPopulations = Arrays.asList(
            new CityPopulation("New York", 8000000),
            new CityPopulation("Los Angeles", 4000000),
            new CityPopulation("Chicago", 2700000),
            new CityPopulation("New York", 7500000),
            new CityPopulation("Los Angeles", 3800000),
            new CityPopulation("Chicago", 2600000)
        );

        출력예시
        ===
        New York 평균 인구 : 7750000명
        Chicago 평균 인구 : 2650000명
        Los Angeles 평균 인구 : 3900000명
*/

        List<CityPopulation> cityPopulations = Arrays.asList(
                new CityPopulation("New York", 8000000),
                new CityPopulation("Los Angeles", 4000000),
                new CityPopulation("Chicago", 2700000),
                new CityPopulation("New York", 7500000),
                new CityPopulation("Los Angeles", 3800000),
                new CityPopulation("Chicago", 2600000)
        );

        System.out.println("+ 도시별 전체 인구 +");
        Map<String, Integer> collect1 = cityPopulations.stream()
                .collect(Collectors.groupingBy(CityPopulation::city, Collectors.summingInt(CityPopulation::population)));

        collect1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(String.format("%s : %,d명", entry.getKey(), entry.getValue())));

        System.out.println("+ 도시별 평균 인구 +");
        Map<String, Double> collect2 = cityPopulations.stream()
                .collect(Collectors.groupingBy(CityPopulation::city, Collectors.averagingDouble(CityPopulation::population)));

        collect2.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(String.format("%s : %,.0f명", entry.getKey(), entry.getValue())));
    }

    record CityPopulation(String city, int population) {}
}
