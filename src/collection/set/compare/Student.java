package collection.set.compare;

public class Student implements Comparable<Student> {

    private static int lastStudentNo = 20240000;
    private int studentNo;
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.studentNo = ++lastStudentNo;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Student student) {
        int studentNoCompared = Integer.compare(this.studentNo, student.studentNo);
//      기본 정렬 = 학번순
        return studentNoCompared;
    }

    public String toString() {
        return "학번 : " + studentNo + " | 이름 : " + name + " | 나이 : " + age +  " | 키 : " + height;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
