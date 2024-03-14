package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
//  Key 와 Value 의 값으로 구성되는 Map.Entry 객체를 저장하는 구조
//  Entry : Map 인터페이스 내부에 선언된 중첩 인터페이스
//  Key는 중복 지정될 수 없으며, Value는 중복 저장될 수 있다.
//  기존 Key와 동일한 키로 저장하게될 경우,
//  기존 값은 없어지고, 새로운 값으로 대체된다.
/*
    구현 클래스 :
    HashMap, HashTable, LinkedHashMap, Properties, TreeMap
*/

    public static void main(String[] args) {

//      제네릭으로 Key 타입, Value 타입 지정
        Map<String, Integer> map = new HashMap<>();

//      새로운 key, value 쌍을 추가
        map.put("사과", 1500);
        map.put("바나나", 3000);
        map.put("오렌지", 2000);

//      전체 크기 확인하기
        int size = map.size();
        System.out.println("size = " + size);

//      get : key 값으로 value
        Integer bananaPrice = map.get("바나나");
        System.out.println("bananaPrice = " + bananaPrice);

//      같은 Key 입력의 경우 마지막에 저장된 값으로 대체
        map.put("오렌지", 2500);
        System.out.println("오렌지 가격 : " + map.get("오렌지"));

//      객체 순회
        Set<String> keySet = map.keySet();  // Key만 순회
        Collection<Integer> values = map.values();  // Value만 순회
        Set<Map.Entry<String, Integer>> entries = map.entrySet();   // Key - Value 순회

        System.out.println("keySet = " + keySet);
        System.out.println("values = " + values);
        System.out.println("entries = " + entries);

//      for-each : 객체의 내부 한 요소씩 순회하는 방법
//      1. keySet을 통한 순회
        for (String key : keySet) {
            System.out.println("key = " + key);
        }

//      2. values 순회
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

//      3. Entry 순회
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
            System.out.println("entry = " + entry); // 사과=1500 toString() 되어있음
        }
    }
}
