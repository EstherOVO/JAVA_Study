package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

//      시간 측정 : ArrayList
        long startTime, endTime;

        startTime = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();

        System.out.println("ArrayList 삽입 소요 시간 : " + (endTime - startTime));

//      시간 측정 : LinkedList
        startTime = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();

        System.out.println("LinkedList 삽입 소요 시간 : " + (endTime - startTime));
    }
}
