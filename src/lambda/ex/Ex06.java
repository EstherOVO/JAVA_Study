package lambda.ex;

import java.util.function.Function;

public class Ex06 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };

        double avgEnglish = avg(students, Student::getEnglishScore);
        double avgMath = avg(students, Student::getMathScore);

        System.out.println("영어 평균 점수 : " + avgEnglish);
        System.out.println("수학 평균 점수 : " + avgMath);
    }

    static double avg (Student[] students, Function<Student, Integer> function) {

        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }

        double avg = (double) sum / students.length;
        return avg;
    }

    static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}

