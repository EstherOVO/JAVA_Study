package polymorphism;

public class Polymorphism01 {
    public static void main(String[] args) {

//      부모 타입의 변수 (= 참조) 부모 타입의 객체
        SuperClass superClass = new SubClass();
        superClass.superMethod();

//      자식 타입의 변수 (= 참조) 자식 타입의 객체
        SubClass subClass = new SubClass();
        subClass.subMethod();       // 자기 자신의 메소드와
        subClass.superMethod();     // 상속받은 부모 메소드도 사용 가능

//      부모 타입의 변수가 자식 타입의 객체를 참조 → 다형적 참조
        SuperClass polymorph = new SubClass();
        polymorph.superMethod();     // 부모 변수 타입의 메소드 호출 가능
//      polymorph.subMethod();          자식 타입의 메소드 호출 불가

//      자식 타입의 변수는 부모 객체를 담을 수 없다.
//      SubClass polymorph2 = new SuperClass();
    }
}
