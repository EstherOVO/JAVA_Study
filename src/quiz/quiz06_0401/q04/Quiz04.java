package quiz.quiz06_0401.q04;

import stream.ex.City;

import java.util.Arrays;
import java.util.List;

public class Quiz04 {
    public static void main(String[] args) {

        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을")));

                itinerary.stream()
                        .flatMap(city -> city.attractions.stream())
                        .distinct()
                        .sorted()
                        .forEach(System.out::println);
    }

    public static class City {

        String name;
        List<String> attractions;

        public City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }
    }
}
