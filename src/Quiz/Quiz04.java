package Quiz;

public class Quiz04 {
    public static void main(String[] args) {

/*
        메서드 : 배열에서 최소값과 최대값 찾기
        배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
        예시)
        int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
        출력
        ==
        최소값 : -5  최대값 : 100
*/

        int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};

        findMaxMin(numbers);
    }

    public static void findMaxMin(int[] numbers) {

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("최댓값 : " + max);

        int min = numbers[0];

        for (int j = 0; j < numbers.length; j++) {
            if (min > numbers[j]) {
                min = numbers[j];
            }
        }
        System.out.println("최솟값 : " + min);
    }
}
