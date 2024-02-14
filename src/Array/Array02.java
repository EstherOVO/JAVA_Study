package Array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

//      배열(Array) : 같은 타입의 변수를 반복적으로 선언할 때 동일한 타입을 연속된 메모리 공간에 저장하는 자료 구조

        int[] scores;        // int 타입의 배열 변수를 선언
        scores = new int[6]; // 배열 생성 : 6개 만큼의 길이 배열 생성

//      배열의 값을 초기화(0부터 시작 주의!)
        scores[0] = 80;
        scores[1] = 70;
        scores[2] = 90;
        scores[3] = 50;
        scores[4] = 75;
        scores[5] = 60; // → 배열을 초기화하지 않으면, 자동으로 초기값으로 초기화된다.
//      기본 타입의 경우 0(boolean 타입은 false), 참조 타입의 경우 null로 초기값이 설정된다.
//      scores[6] = 80; → 배열의 범위를 초과한 인덱스에 접근할 경우 예외 발생(ArrayIndexOutOfBoundsException)

/*
        System.out.println("학생1 점수 : " + scores[0]);
        System.out.println("학생2 점수 : " + scores[1]);
        System.out.println("학생3 점수 : " + scores[2]);
        System.out.println("학생4 점수 : " + scores[3]);
        System.out.println("학생5 점수 : " + scores[4]);
        System.out.println("학생6 점수 : " + scores[5]);
 */

//      반복문 활용 → 배열을 사용하면 반복문으로 리팩토링할 수 있다.
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "번 점수 : " + scores[i]);
        }

    }
}
