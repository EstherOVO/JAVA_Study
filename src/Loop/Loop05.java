package Loop;

public class Loop05 {
    public static void main(String[] args) {

/*
        continue문
        while (조건식) {
          code 1;
          continue; → 즉시 code2를 실행하지 않고 조건식으로 이동한다.
          code 2;
*/

//      만약 3을 건너뛰고 싶다면..

        int i = 1;
        while (i < 6) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }

    }
}
