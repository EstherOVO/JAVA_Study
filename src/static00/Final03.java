package static00;

public class Final03 {

//  final 상수와 참조형 변수
    public static void main(String[] args) {

        final int var1 = 100;
//      var1 = 200; → final 값은 변경 불가

        final Data data = new Data(100);    // 0x100
        System.out.println(data.getField());

//      data = new Data(200); → final 값은 변경 불가  0x200 : 참조값 변수를 final 변수로 지정했을 때 참조값 자체는 변경 불가능하지만

        data.setField(200); // 참조값에 위치해 있는 객체 내부의 값을 변경하는 것은 가능하다.
        System.out.println(data.getField());
    }
}
