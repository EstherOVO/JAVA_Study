package library.lang;

// 자바 Record
// 자바 14버전부터 새롭게 도입된 데이터 구조
// VO(Value Object) 객체 또는 DTO(Data Transfer Object)를 작성할 때
// 불변하는 데이터 객체를 간단하게 정의해 주는 자료 구조
record Human(String name, int age) {}

// 컴파일러가 자동으로 기본 생성자, getter, equals, hashCode, toString을 생성한다.
public class Record {
    public static void main(String[] args) {
        Human human1 = new Human("홍길동", 30);

//      getter 메서드와 동일한 효과를 내는 메서드
        System.out.println("getter age 값 : " + human1.age());
        System.out.println("getter name 값 : " + human1.name());

//      toString 메서드 오버라이딩
        System.out.println("toString : " + human1.toString());

//      equals도 오버라이딩
        Human human2 = new Human("홍길동", 30);
        Human human3 = new Human("임꺽정", 30);
        System.out.println("필드 값이 같을 때 : " + human1.equals(human2));
        System.out.println("필드 값이 다를 때 : " + human1.equals(human3));

//      hashCode 오버라이딩
        System.out.println("기본 해시코드 : " + human1.hashCode());
        System.out.println("데이터가 같은 경우 : " + human2.hashCode());
        System.out.println("데이터가 다를 경우 : " + human3.hashCode());
    }
}

// class StrongHuman extends Human {} ← 레코드는 final 키워드가 적용되어 더 이상 상속되지 않는다.
