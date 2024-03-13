package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
//  컬렉션 프레임워크의 주요 인터페이스 중 하나
/*
    Set의 특징 :
    1. 중복을 허용하지 않는다.
    2. 순서를 보장하지 않는다.
    (수학의 집합과 유사한 구조를 가진다.)

    Set 구현체의 종류 :
    1. HashSet : 가장 많이 사용되는 기본 Set → 순서 보장이 없으며 가장 뛰어난 성능을 지닌다.
    2. LinkedHashSet : 요소가 추가된 순서를 보장한다.(예외적임)
    3. TreeSet : 요소가 자연 순서로 정렬되어 저장되는 구조
*/

    public static void main(String[] args) {

        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        System.out.println(numberSet);

        numberSet.add(1);   // 중복이 허용되지 않는다.
        boolean addDuplicate = numberSet.add(2);    // 중복 → false 반환
        System.out.println("addDuplicate = " + addDuplicate);
        System.out.println(numberSet);

        boolean addNewElement = numberSet.add(4);   // 중복이 아닌 요소 → true 반환
        System.out.println("addNewElement = " + addNewElement);
        System.out.println(numberSet);

//      반환되는 boolean을 통해 조건문 사용 가능
        if (numberSet.add(3) == false) {
            System.out.println("3은 이미 존재하는 값입니다.");
        }

//      contains() : 포함 여부 반환
        if (numberSet.contains(2)) {
            System.out.println("Set에 2가 포함되어 있습니다.");
        }

//      size() : 데이터의 크기
        System.out.println("데이터 크기 : " + numberSet.size());

        for (int i = 0; i < numberSet.size(); i++) {
//          인덱스를 기준으로 요소를 순회할 수 없다. → 순서를 보장하지 않기 때문!
//          numberSet.get(i);
        }

//      인덱스와 관련된 메서드는 없다!
//      numberSet.get(i);
//      numberSet.indexOf();

//      요소 순회하는 법 1. 향상된 for문 사용 → 단, 순서를 보장할 수 없음
        for (Integer i : numberSet) {
            System.out.print(i + " ");
        }
        System.out.println();

//      요소 순회하는 법 2. 반복자 사용
        Iterator<Integer> it = numberSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

//      요소 제거
        boolean removeExist = numberSet.remove(3);
        boolean removeNone = numberSet.remove(5);
        System.out.println("removeExist = " + removeExist);
        System.out.println("removeNone = " + removeNone);
        System.out.println(numberSet);

//      모든 요소 제거
        numberSet.clear();
        System.out.println("모든 요소 제거 : " + numberSet);

//      요소 한 번에 추가
        numberSet.addAll(Arrays.asList(5, 6, 7, 8));
        System.out.println(numberSet);

//      배열로 반환하기 → Object의 배열
        Object[] array = numberSet.toArray();
    }
}
