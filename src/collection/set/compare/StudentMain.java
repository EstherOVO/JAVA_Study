package collection.set.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {

        System.out.println("== Comparable<> 학번순 정렬 ==");

        Student student1 = new Student("홍길동", 30, 170);
        Student student2 = new Student("임꺽정", 40, 185.4);
        Student student3 = new Student("전우치", 25, 175.2);
        Student student4 = new Student("허생", 45, 163.6);

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.addAll(Arrays.asList(student1, student2, student3, student4));

        for (Student student : studentTreeSet) {
            System.out.println(student);
        }

        System.out.println("== Comparator<> 이름순 정렬 ==");
//      이름 비교자 생성
        StudentComparator nameStudentComparator = new StudentComparator(StudentComparator.SortBy.NAME, StudentComparator.SortDirection.ASC);

//      정렬 기준으로 이름 비교자
        TreeSet<Student> nameSortSet = new TreeSet<>(nameStudentComparator);

//      정렬 대상 삽입
        nameSortSet.addAll(Arrays.asList(student1, student2, student3, student4));

        for (Student student : nameSortSet) {
            System.out.println(student);
        }

        System.out.println("== Comparator<> 나이순 / 키순 오름차순 정렬 ==");
        TreeSet[] treeSets1 = {
                new TreeSet<Student>(new StudentComparator(StudentComparator.SortBy.AGE, StudentComparator.SortDirection.ASC)),
                new TreeSet(new StudentComparator(StudentComparator.SortBy.HEIGHT, StudentComparator.SortDirection.ASC))};

        for (TreeSet<Student> treeSet : treeSets1) {
            treeSet.addAll(Arrays.asList(student1, student2, student3, student4));
            for (Student student : treeSet) {
                System.out.println(student);
            }
        }

        System.out.println("== Comparator<> 나이순 / 키순 내림차순 정렬 ==");
        TreeSet[] treeSets2 = {
                new TreeSet<Student>(new StudentComparator(StudentComparator.SortBy.AGE, StudentComparator.SortDirection.DESC)),
                new TreeSet(new StudentComparator(StudentComparator.SortBy.HEIGHT, StudentComparator.SortDirection.DESC))};

        for (TreeSet<Student> treeSet : treeSets2) {
            treeSet.addAll(Arrays.asList(student1, student2, student3, student4));
            for (Student student : treeSet) {
                System.out.println(student);
            }
        }
    }
}
