package Class_;

public class Class06 {
    public static void main(String[] args) {

        Student student1 = createStudent("홍길동", 80, 15);
        Student student2 = createStudent("임꺽정", 70, 17);

//      학생 타입의 배열을 선언
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

//      Extract Method 기능으로 객체의 필드에 접근하는 반복되는 코드 블록을 메소드로 만든다.
//      전달된 학생 객체의 필드 값을 읽어서 출력할 수 있다.
        for (int i = 0; i < students.length; i++) {
            printInfomation(students[i]);
        }
    }

    private static void printInfomation(Student students) {
        System.out.println("학생 이름 : " + students.name + " / 점수 : " + students.score + " / 나이 : " + students.age);
    }

    //  학생 객체를 생성해주는 메소드
    public static Student createStudent(String name, int score, int age) {
        Student student = new Student();    // 생성된 객체(학생 타입의 인스턴스)는 힙(Heap) 영역에 던져진다.
        student.name = name;
        student.score = score;
        student.age = age;
        return student;     // 객체(객체의 참조값(주소 0x100))
    }
}
