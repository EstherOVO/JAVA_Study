package generic;

import java.util.List;
import java.util.Map;

public class Generic03 {
//  제네릭의 Type Parameter
/*
    일반적으로 한 글자로 표현된다.
    T : Type
    E : Element(요로 / 컬렉션이 이용)
    K : Key
    V : Value
    N : Number
    ? : 와일드카드
    S, U, V : 여러 개의 제네릭 타입을 사용해야 할 때 추가적 사용
*/

    static class Box<T, K, V, E, S, U, MODEL> {
        T content;  // 일반적으로 타입을 나타낸다.
        T content2;
        S anotherTypeContent;
        U anotherTypeContent2;
        MODEL model;    // 일반적이지 않지만, 사용자 정의 제네릭 사용 가능

        Map<K, V> map;  // 키와 값 쌍으로 된 자료 구조에서 사용
        List<E> list;   // 내부 요소를 가리킬 때
    }

    public static void main(String[] args) {

        Box<String, Integer, String, Boolean, Double, Character, Long> box = new Box<>();
        String content = box.content;   // T
        String content2 = box.content2; // T
        Double anotherTypeContent = box.anotherTypeContent; // S
        Character anotherTypeContent2 = box.anotherTypeContent2; // U

        Map<Integer, String> map = box.map; // K, V
        List<Boolean> list = box.list;  // E

        Long model = box.model; // MODEL
    }
}
