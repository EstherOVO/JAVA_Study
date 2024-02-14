package Array;

public class Ex04 {
    public static void main(String[] args) {

//      2차원 배열의 합계 구하기
//      2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.

        int arr [][] = new int[2][2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        int sum = 0;

        System.out.print("배열의 모든 요소 : ");
        for (int i = 0; i < arr.length; i++) {  // 행수만큼의 반복
            for (int j = 0; j < 2; j++) {       // 열수만큼의 반복
                if (j == 1 && i == 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
                sum += arr[i][j];
            }
        }
        System.out.println();
        System.out.println("합계 : " + sum);

    }
}
