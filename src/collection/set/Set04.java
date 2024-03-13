package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Set04 {

//  LinkedHashSet : HashSet과 유사한 기능들을 모두 가진다.(중복 허용하지 않음)
//  내부적으로 LinkedList를 사용하여 순서를 가질 수 있게 된다.
//  중복을 불허하는 고유 요소를 유지하면서도 순서를 기억해야 할 때 사용한다.
//  HashSet보다 성능적으로 조금 느리다.

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("해시셋은");
        hashSet.add("순서를");
        hashSet.add("보장하지");
        hashSet.add("않습니다");
        hashSet.add(null);
        hashSet.add(null);  // null 삽입 가능 + 중복 불가
        System.out.println("hashSet = " + hashSet);

        linkedHashSet.add("링크드");
        linkedHashSet.add("해시셋은");
        linkedHashSet.add("순서를");
        linkedHashSet.add("보장합니다");
        linkedHashSet.add(null);
        linkedHashSet.add(null);      // null 삽입 가능 + 중복 불가
        linkedHashSet.add("링크드");   // 중복 불가
        System.out.println("linkedHashSet = " + linkedHashSet);

        linkedHashSet.addFirst("첫 번째 순서에 추가");
        System.out.println("linkedHashSet = " + linkedHashSet);

//      첫 번째 삭제
        linkedHashSet.removeFirst();
        System.out.println("linkedHashSet = " + linkedHashSet);

//      첫 번째 요소 가져오기
        String first = linkedHashSet.getFirst();
        System.out.println("first = " + first);

//      순서를 뒤집은 셋 반환
        SequencedSet<String> reversed = linkedHashSet.reversed();
        System.out.println("reversed = " + reversed);
    }
}
