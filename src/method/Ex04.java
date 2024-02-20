package method;

public class Ex04 {
    public static void main(String[] args) {

//      배열에서 최소값과 최대값 찾기
//      배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
        int[] numbers = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};    // 변경해 보세요.
        findMinAndMax(numbers);
    }

    public static void findMinAndMax(int[] numbers) {

//      여기에 코드를 작성하세요.
        int max = numbers[0];
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("최댓값 : " + max);

        int min = numbers[0];
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("최솟값 : " + min);
    }
}
