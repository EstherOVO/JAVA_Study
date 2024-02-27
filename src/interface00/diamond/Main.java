package interface00.diamond;

public class Main {
    public static void main(String[] args) {


//      다형적 타입 참조
//      부모 인터페이스 변수 = 자식 객체
        First first = new ImplClass();
        first.firstMethod();                // 부모 타입의 메소드 실행 가능
        first.commonMethod();               // 공통 메소드 실행
//      first.secondMethod();                  다른 타입 인터페이스 실행 불가

        Second second = new ImplClass();
        second.secondMethod();
        second.commonMethod();
//      second.firstMethod();

        ImplClass implClass = new ImplClass();
        implClass.firstMethod();
        implClass.secondMethod();
        implClass.commonMethod();
    }
}
