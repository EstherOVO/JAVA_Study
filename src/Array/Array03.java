package Array;

public class Array03 {
    public static void main(String[] args) {

        int[] scores;   // 배열 변수 선언
        scores = new int[] {80, 70, 90, 50, 75, 60};    // 배열 초기화 5개 길이

        int[] scores2 = {80, 70, 90};   // 선언과 초기화를 동시에 할 수 있다.

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "번 점수 : " + scores[i]);
        }

        System.out.println(scores); // [I@506e1b77 : [i 정수형 배열 → 해당 메모리 번지에 참조됐다는 의미
//      배열에 직접 접근하게 될 경우 참조값을 반환한다.
        System.out.println(scores[0]);  // 배열의 내용에 접근하고 싶을 때는 배열[index]로 접근한다.

/*
        배열의 값을 읽는 순서
        1. 변수의 값을 읽는다. → 참조값
        2. 변수의 참조값을 통해 실제 배열에 접근한다.
        3. 인덱스를 통해 해당 위치 내용에 접근한 후 내용을 읽는다.
*/

    }
}
