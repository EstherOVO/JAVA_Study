package nested;

public class Main {
    public static void main(String[] args) {

//      var 키워드 : Java 10부터 도입 → 지역 변수의 타입 추론 가능
//      가독성 향상을 위해 도입되었다.

//      1. 정적 중첩 클래스(Static Nested Class)
//      OutterClass 인스턴스 생성 없이도 바로 '.' 접근을 통해 클래스를 생성할 수 있다.
//      OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass(); →
        var nested = new OuterClass.NestedStaticClass();

        nested.printMessage();

//      2. (인스턴스) 내부 클래스(Inner Class)
//      외부 클래스 인스턴스를 먼저 생성하고, 생성된 인스턴스에서 접근할 수 있다.
        OuterClass outerClass = new OuterClass();
        var outerInstance = outerClass.new InstanceInnerClass();
        outerInstance.printMessage();

//      3. 지역 클래스(Local Class)
//      외부 클래스에서 지역 메소드에 접근해서 사용 가능하며, 지역 내부에서 사용이 완료됨
        outerClass.displayMessage();

//      다른 클래스에서 정적 중첩 클래스 생성 시
        School.Student student = new School.Student("홍길동", 80);
        student.introduce();
    }
}
