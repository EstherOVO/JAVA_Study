package loop;

public class Loop03 {
    public static void main(String[] args) {

/*
        do-while문
        - while문과 유사하지만, 무조건 한 번은 코드를 실행한다.

        do {
            반복할 코드
        } while (조건식);
 */

//      do-while문의 경우 최소 한번은 코드블록을 실행한다.
        int i = 10;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

//      일반 while문의 경우 처음부터 false 조건을 만나면 아무것도 출력하지 않는다.
        i = 10;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

    }
}
