package stream.ex;

import java.util.List;

public class City {

    String name;
    List<String> attractions;

    City(String name, List<String> attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    String getName() {
        return name;
    }

    List<String> getAttractions() {
        return attractions;
    }
}
