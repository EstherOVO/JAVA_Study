package polymorphism;

public class Polymorphism03 {
    public static void main(String[] args) {

        SuperClass superClass = new SubClass();     // 다형적 참조
//      부모 타입의 변수 = 자식 타입의 객체
        superClass.superMethod();
//      일시적 다운 캐스팅을 사용하여 하위(확장된) 클래스의 기능 호출
        ((SubClass) superClass).subMethod();
    }
}
