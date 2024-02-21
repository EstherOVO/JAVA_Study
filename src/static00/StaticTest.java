package static00;

public class StaticTest {

    private int instanceVariable;
    private static int classVariable;

//  생성자
    public StaticTest() {

    }

//  메소드

//  클래스 메소드(= static 메소드)
    public static void staticInnerCall() {
//      instanceVariable; → static 메소드에서 인스턴스 변수 접근 불가(컴파일 에러)
        classVariable++; // static 메소드에서 클래스 변수 접근 가능

//      instanceMethod(); → 인스턴스 메소드 접근 불가
        classMethod();   // 클래스 메소드 접근 가능
    }

//  인스턴스 메소드
    public void innerCall() {
        instanceVariable++; // 인스턴스 메소드에서 인스턴스 변수 접근 가능
        classVariable++;    // 인스턴스 메소드에서 클래스 변수 접근 가능

        instanceMethod();   // 호출 가능
        classMethod();      // 호출 가능
    }

    private void instanceMethod() {
        System.out.println(instanceVariable);
    }

    private static void classMethod() {
        System.out.println(classVariable);
    }
}
