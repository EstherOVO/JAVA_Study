package access_modifier.ex.com.school.management;

public class Student_Ex01 {
    public static void main(String[] args) {

/*
        1. 패키지 생성 : com.school.management

        2. Student 클래스 구현 :
        - 인스턴스 변수 : name, studentId
        - 생성자 : Student(String name, String studentId)로 학생의 이름과 ID를 초기화
        - 게터와 세터 : 각 변수에 대한 public 게터와 세터 메서드

        3. Main 클래스
        - com.school.management 패키지의 Student 객체를 생성
        - 학생의 이름과 ID를 설정
        - 설정된 이름과 ID를 출력

        실행 결과
        ===
        학생 이름 : 홍길동
        학생 ID : S1234
*/

        Student student1 = new Student("김자바", "J0101");
        Student student2 = new Student("홍길동", "J0202");

        System.out.println("= 실행결과 =");
        System.out.println("학생 이름 : " + student1.getInstance1());
        System.out.println("학생 ID : " + student1.getInstance2());

        System.out.println("= 실행결과 =");
        System.out.println("학생 이름 : " + student2.getInstance1());
        System.out.println("학생 ID : " + student2.getInstance2());

        student1.setName("홍춘향");
        student1.setSturdenId("J0303");
        System.out.println("= 실행결과 =");
        System.out.println("학생 이름 : " + student1.getInstance1());
        System.out.println("학생 ID : " + student1.getInstance2());
    }
}
