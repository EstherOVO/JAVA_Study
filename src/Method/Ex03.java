package Method;

public class Ex03 {
    public static void main(String[] args) {

//      정수 배열의 평균 구하기
        int[] numbers = {5, 10, 25, 100};    // 변경해 보세요.
        System.out.println("평균 : " + calculateAverage(numbers));
    }

    public static double calculateAverage(int[] numbers) {

//      여기에 코드를 작성하세요.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int avg = sum / numbers.length;
        return avg;
    }
}