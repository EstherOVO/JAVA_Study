package generic.ex.ex05;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {

        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        printMediaDetails(myMediaList);
    }

    static void printMediaDetails(List<? extends Media> mediaList) {

        for (Media media : mediaList) {
            System.out.println(media.getInfo());
        }
    }
}
