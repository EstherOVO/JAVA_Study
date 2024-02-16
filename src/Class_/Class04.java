package Class_;

public class Class04 {
    public static void main(String[] args) {
        Student student1;           // Student라는 타입의 변수를 선언
        student1 = new Student();   // Student 타입의 변수를 초기화 및 객체를 생성 → 인스턴스화
        student1.name = "홍길동";
        student1.score = 80;
        student1.age = 15;

        Student student2 = new Student();   // 동시에 선언과 초기화
        student2.name = "임꺽정";            // '.'을 통하여 필드에 접근 가능
        student2.score = 70;
        student2.age = 17;

        System.out.println(student1);
        System.out.println(student2);

//      학생 타입의 배열을 선언
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 이름 : " + students[i].name + " / 점수 : " + students[i].score + " / 나이 : " + students[i].age);
        }
    }
}
