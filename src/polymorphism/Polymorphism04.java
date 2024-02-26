package polymorphism;

public class Polymorphism04 {
    public static void main(String[] args) {

//      부모 타입 변수 = 자식 타입 객체
        SuperClass superClass = new SubClass();
//      부모 타입 변수에 (자식 타입 객체를 부모 타입 변수로 참조한 변수를 대입)
//      타입이 달라 컴파일 에러 → 다운 캐스팅을 통해 대입
        SubClass subClass = (SubClass) superClass;
        subClass.subMethod();
    }
}
