package collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map05 {
    public static void main(String[] args) {
//      TreeMap : Red-Black Tree
//      키를 기준으로 자동 정렬
//      Entry 키의 낮은 것은 왼쪽, Entry Key 높은 것은 오른쪽
//      효율적으로 정렬하고, O(log n) 시간 복잡도로 검색할 수 있다. → binarySearch
//      정렬 범위로 특정 범위를 잘라서 subMap을 생성
        TreeMap<String, Integer> treeMap = new TreeMap<>();

//      무작위로 삽입
        treeMap.put("apple", 10);
        treeMap.put("zoo", 260);
        treeMap.put("desk", 40);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

//      가장 처음의 Entry 반환
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        System.out.println("firstEntry = " + firstEntry);
        String firstKey = treeMap.firstKey();
        System.out.println("firstKey = " + firstKey);

//      내림차순 정렬 맵 반환
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        System.out.println("descendingMap = " + descendingMap);

        System.out.println("===== 내림차순 맵 ======");
        for (Map.Entry<String, Integer> entry : descendingMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("====== 알파벳 \'c\' ~ \'h\' 사이에 있는 맵 ======");
        SortedMap<String, Integer> subMap = treeMap.subMap("c", "h");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
