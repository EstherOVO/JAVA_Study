package collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set05 {
//  TreeSet
//  자동으로 정렬되는 중복을 불허하는 자료구조
//  Red-Black Tree 알고리즘을 기반으로 사용

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(35);
        treeSet.add(5);     // 중복 불허
//      treeSet.add(null);  null 불허(RuntimeException) → null은 비교할 수 없기 때문
        System.out.println("treeSet = " + treeSet);

//      첫 번째 요소 가져오기
        Integer first = treeSet.first();
        System.out.println("first = " + first);

//      마지막 요소 가져오기
        Integer last = treeSet.last();
        System.out.println("last = " + last);

//      10보다 head(왼쪽, 작은) 숫자들의 집합을 반환(요소 불포함)
        SortedSet<Integer> headSet = treeSet.headSet(10);
        System.out.println("headSet = " + headSet);

//      10보다 tail(오른쪽, 큰) 숫자들의 집합을 반환(요소 포함)
        SortedSet<Integer> tailSet = treeSet.tailSet(10);
        System.out.println("tailSet = " + tailSet);
    }
}
