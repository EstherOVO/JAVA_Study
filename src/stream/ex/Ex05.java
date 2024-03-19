package stream.ex;

import stream.Stream06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05 {
    public static void main(String[] args) {

        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );

        itinerary.stream()
                .flatMap(city -> city.getAttractions().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
