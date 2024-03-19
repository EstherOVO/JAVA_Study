package lambda.ex;

import java.util.function.Function;

public class Ex06 {
    public static void main(String[] args) {

/*
        연습문제 6. 학생 성적 평균 계산하기

        요구사항 :
        주어진 코드를 바탕으로, 학생들의 영어와 수학 평균 점수를 계산하는 프로그램을 작성하세요.
        프로그램은 다음 요구사항을 충족해야 합니다.

        Student 클래스 정의 :
        Student 클래스에는 학생의 이름(String), 영어 점수(int), 수학 점수(int)를 필드로 가집니다.
        getEnglishScore() 메서드와 getMathScore() 메서드를 통해 각각의 점수를 반환할 수 있어야 합니다.

        평균 점수 계산 :
        avg(Function<Student> function) 메서드는
        Function<Student, Integer> 함수형 인터페이스를 매개변수로 받아, 학생들의 평균 점수를 계산합니다.
        avg 메서드는 모든 학생들에 대해 주어진 함수형 인터페이스를 적용한 후, 그 결과값들의 평균을 반환합니다.

        프로그램 실행 :
        메인 메서드에서는 두 학생의 정보를 Student 배열에 저장합니다.
        영어 점수의 평균과 수학 점수의 평균을 각각 계산하여 출력합니다
*/

        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };

        double mathAvgScore = getAvg(students, Student::getMathScore);
        double englishAvgScore = getAvg(students, Student::getEngScore);

        System.out.println("수학 평균 점수 : " + mathAvgScore + "점");
        System.out.println("영어 평균 점수 : " + englishAvgScore + "점");
    }

    public static double getAvg(Student[] students, Function<Student, Integer> function) {

        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }

        return (double) sum / students.length;
    }

    public static class Student {

        private String name;
        private int mathScore;
        private int engScore;

        public Student(String name, int mathScore, int engScore) {
            this.name = name;
            this.mathScore = mathScore;
            this.engScore = engScore;
        }

        public String getName() {
            return name;
        }

        public int getMathScore() {
            return mathScore;
        }

        public int getEngScore() {
            return engScore;
        }
    }
}
