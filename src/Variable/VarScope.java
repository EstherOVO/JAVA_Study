package Variable;

public class VarScope {
    public static void main(String[] args) {

/*
       ◎ 변수의 사용 범위
         - 자바의 모든 변수는 중괄호({}) 블록 내에서 선언되고 사용된다.
         - int value 10; → 지역 변수(local variable)
         - 변수는 블록 내 어디서나 선언할 수 있다.
         - 사용할 때는 자신이 선언된 위치로부터 자신이 속한 블록 내부에서만 사용 가능하다.
         - 해당 블록을 벗어나면 선언된 변수가 소멸된다. → compile error
 */

        int value = 10;
        value = 20;
        System.out.println(value);

        if (value > 20) {
            int localVal = 30;
            System.out.println(value+localVal); // 바깥 블록에서 선언한 변수는 내부에서 사용 가능

    }
}

}