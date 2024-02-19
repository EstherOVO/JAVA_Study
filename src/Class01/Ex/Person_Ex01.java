package Class01.Ex;

public class Person_Ex01 {
    public static void main(String[] args) {

//      Person 클래스를 설계해 주세요.
//      필드 : name, age, gender
//      생성자 : 모든 속성을 초기화하는 생성자 이름 성별만 초기화하는 생성자
//      메소드 : 필드 정보를 출력하는 printInfo()

//      main 메소드에서 사용해 보세요.

        Person person1 = new Person("홍길동", 25, "남자");
        Person person2 = new Person("임꺽정", 30, "여자");

        Person[] people = {person1, person2};

        for (Person p : people) {
            System.out.println("이름 : " + p.name + " / 점수 : " + p.age + " / 나이 : " + p.gender);
        }
    }
}
