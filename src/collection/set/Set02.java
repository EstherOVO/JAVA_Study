package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Set02 {
    public static void main(String[] args) {

        Set<String> sports = new HashSet<>();
        sports.add("축구");
        sports.add("야구");
        sports.add("아이스하키");
        System.out.println("sports = " + sports);

        Set<String> winterSports = new HashSet<>();
        winterSports.add("스키");
        winterSports.add("썰매");
        winterSports.add("아이스하키");
        System.out.println("winterSports = " + winterSports);

//      addAll() : 합집합
        Set<String> union = new HashSet<>(sports);
        union.addAll(winterSports);
        System.out.println("union = " + union);

//      retainAll() : 교집합
        Set<String> intersection = new HashSet<>(sports);
        intersection.retainAll(winterSports);
        System.out.println("intersection = " + intersection);

//      removeAll() : 차집합
        Set<String> difference = new HashSet<>(sports);
        difference.removeAll(winterSports);
        System.out.println("difference = " + difference);
    }
}
