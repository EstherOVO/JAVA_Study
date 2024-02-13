package Loop;

public class Loop06 {
    public static void main(String[] args) {

/*
        for문
        for (1. 초기화식; 2. 조건식; 4. 증감식;)
            3. 실행문

        1. 초기화식이 가장 먼저 실행된다.
        2. 조건식을 평가해서 true일 경우 code를 실행하고 false일 경우 종료한다.
        3. code를 모두 수행하고 증감식을 실행한 후, 조건식으로 돌아가 true/false를 판별합니다.
        4. 조건식이 true인 동안 (2) 조건식 → (3) → 실행문 → (4) 증감식을 반복한다
*/

//      1부터 10까지 출력하는 for 반복문
        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

//      while (true) { = for ( ; ; ) {
//      → 무한 반복 코드

    }
}
