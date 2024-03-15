package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayUtil {
    public static void main(String[] args) {

//      Arrays : 배열을 다루기 위한 메서드를 제공하는 유틸리티 클래스
        int[] numbers = {9, 4, 6, 2, 3, 5, 1, 7};

//      Arrays.toString() : 배열을 문자열로 변환한다.
        System.out.println("numbers = " + Arrays.toString(numbers));

//      Arrays.sort() : 정렬
        Arrays.sort(numbers);
        System.out.println("정렬된 numbers = " + Arrays.toString(numbers));

//      Arrays.binarySearch() : 이진 탐색으로 요소의 index 찾는다
//      이진 탐색은 정렬이 되어있어야만 탐색이 가능하다. 정렬이 안 되어 있으면 -1 반환
        int index = Arrays.binarySearch(numbers, 1);
        System.out.println("숫자 1의 인덱스 = " + index);

//      Arrays.fill(배열, 값) : 배열을 특정 값으로 채운다.
        Arrays.fill(numbers, 10);
        System.out.println("10으로 채워진 numbers = " + Arrays.toString(numbers));

//      Arrays.equals(배열, 다른 배열) : 두 배열이 같은지 여부를 반환한다.
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("배열 같은지 여부 equals = " + equals);

//      Arrays.deepEquals() : 다차원 배열 비교한다.
        String[][] data1 = {{"a", "b"}, {"c", "d"}};
        String[][] data2 = {{"a", "b"}, {"c", "d"}};
        boolean deepEquals = Arrays.deepEquals(data1, data2);
        System.out.println("다차원 배열이 같은지 여부 deepEquals = " + deepEquals);

//      Arrays.copyOf(원본 배열, 복사할 배열 길이) : 배열 복사본을 생성한다.
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("copyArr = " + Arrays.toString(copyArr));

//      Arrays.compare() : 배열의 요소를 비교한다.
//      길이가 크면 큰 것 → 길이가 같으면 배열의 요소 하나씩 비교해서 인덱스 0부터 차례대로 비교하여 큰 요소가 큰 것으로 간주한다.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 3, 2};
        int compared = Arrays.compare(originArr, copyArr);
        System.out.println("compared = " + compared);
        System.out.println(Arrays.compare(array1, array2)); // 같으면 0
        System.out.println(Arrays.compare(array1, array3)); // 음수 : array1 < array 3
        System.out.println(Arrays.compare(array3, array1)); // 양수 : array1 > array 3

//      Arrays.copyOfRange(원본, 시작 인덱스, 끝 인덱스) : 부분적으로 배열의 일부를 복사
        int[] copyOfRangeArr = Arrays.copyOfRange(originArr, 1, 3);
        System.out.println("copyOfRangeArr = " + Arrays.toString(copyOfRangeArr));

//      Arrays.asList(요소, 요소, ...) : 배열의 고정 크기의 리스트로 변환
        String[] strArr = {"a", "b", "c"};
        List<String> list = Arrays.asList(strArr);
//      ArrayList<String> list = Arrays.asList(strArr);     ArryaList와는 다르다.
//      ArrayList 생성자 또는 addAll 메서드 등의 매개변수로 사용될 수 있다.
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        arrayList.addAll(Arrays.asList("d", "e", "f"));

//      Arrays.stream() : 배열을 소스로 하는 stram을 생성한다. → 스트림 API 사용 가능
        Stream<String> stream = Arrays.stream(strArr);
        stream.forEach(System.out::println);
    }
}
