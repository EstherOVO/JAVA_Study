package collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set03 {

    static class Student {

        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " : " + age + "세";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Student student = (Student) obj;
            return Objects.equals(name, student.name) && age == student.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {

//      객체를 저장할 때 동등성 비교
//      hashCode() 리턴값 (같으면) → equals() 리턴 값 (true) → 동등
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("홍길동", 30));
        studentSet.add(new Student("임꺽정", 30));
        studentSet.add(new Student("홍길동", 30));

        System.out.println("studentSet = " + studentSet.toString());

//      객체의 동등성을 비교하는 비즈니스 로직을 선택하여
//      equals() 메서드와 hashCode() 메서드를 오버라이딩하면
//      HashSet에서 해당 기준으로 중복 요소를 판단한다.
    }
}
