package collection.ex;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 5, 1, 2};

        Arrays.sort(numbers);
        System.out.println("배열 정렬하기 : " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("배열 검색하기(숫자 3의 인덱스) : " + index);

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean equals = Arrays.equals(array1, array2);
        System.out.println("배열 비교하기(equals) : " + equals);

        int compare = Arrays.compare(array1, array2);
        System.out.println("배열 비교하기(compare) : " + compare);

        int[] original = {1, 2, 3, 4, 5};
        int[] copyOfStart = Arrays.copyOfRange(original, 0, 1);
        int[] copyOfEnd = Arrays.copyOfRange(original, 4, 5);
        System.out.println("배열 첫 번째 문자 복사 : " + Arrays.toString(copyOfStart));
        System.out.println("배열 마지막 문자 복사 : " + Arrays.toString(copyOfEnd));

        String[] fruits = {"Apple", "Cherry", "Banana"};
        Arrays.sort(fruits);
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);
    }
}
