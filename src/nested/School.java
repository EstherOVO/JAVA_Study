package nested;

public class School {

//  정적 중첩 클래스(Static Nested Class) : 외부 클래스와 깊은 연관이 있을 때
    static class Student {
        private String name;
        private int score;


        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void introduce() {
            System.out.println("안녕하세요! " + name + "입니다.");
        }
    }

    public static void main(String[] args) {

        Student student = new Student("홍길동", 80);
        student.introduce();
    }
}
