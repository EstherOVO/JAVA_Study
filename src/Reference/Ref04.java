package Reference;

public class Ref04 {
    public static void main(String[] args) {

//      기본 타입
        int a = 10;
        int b = a;  // 값이 복사되어 대입

        System.out.println("a = " + a); // 10
        System.out.println("b + " + b); // 10

        a = 20;                         // a 값을 변경

        System.out.println("===========");
        System.out.println("a = " + a); // 20
        System.out.println("b + " + b); // 10

        b = 100;                        // b 값을 변경

        System.out.println("===========");
        System.out.println("a = " + a); // 20
        System.out.println("b + " + b); // 100

        System.out.println("===========");

//      참조 타입
        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA;     // 값(=참조값(27973e9b))이 복사되어 대입된다. : 얕은 복사

        System.out.println("dataA = " + dataA);     // 참조값 0x10
        System.out.println("dataB = " + dataB);     // 참조값 0x10

        System.out.println("===========");
        System.out.println("dataA.value1 = " + dataA.value1);     // 100 참조값 0x10
        System.out.println("dataB.value1 = " + dataB.value1);     // 100 참조값 0x10

        dataA.value1 = 200;                         // a 값을 변경

        System.out.println("===========");
        System.out.println("dataA.value1 = " + dataA.value1);     // 200 참조값 0x10
        System.out.println("dataB.value1 = " + dataB.value1);     // 200 참조값 0x10

        dataB.value1 = 300;                         // b 값을 변경
        System.out.println("===========");
        System.out.println("dataA.value1 = " + dataA.value1);     // 300 참조값 0x10
        System.out.println("dataB.value1 = " + dataB.value1);     // 300 참조값 0x10
    }
}
