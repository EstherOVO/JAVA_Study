package class00;

public class Class04 {
    public static void main(String[] args) {
        Student student1;           // Student라는 타입의 변수를 선언
        student1 = new Student();
        initStudent(student1, "홍길동", 80, 15);
//      객체를 메소드로 전달(참조값을 복사)
//      메소드 내에서 변경된 필드 값들은 실제 객체에 적용이 된다.

        Student student2 = new Student();   // 선언과 초기화를 동시에 한다.
        initStudent(student2, "임꺽정", 70, 17);

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

    //  학생 객체의 필드를 초기화 해주는 메소드
    public static void initStudent(Student student, String name, int score, int age) {
        student.name = name;
        student.score = score;
        student.age = age;
    }
}
