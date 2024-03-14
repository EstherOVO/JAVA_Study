package collection.set.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class Compare02 {

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " : " + age;
        }
    }

    public static void main(String[] args) {

//      비교자 Comparator 정의 : 익명 객체로 인터페이스 본문 선언
        Comparator<Person> nameComparator = new Comparator<>() {

            @Override
            public int compare(Person o1, Person o2) {
//              나이 비교
//              return o1.age - o2.age;

//              이름 비교 : 문자열(Comparator) 필드의 비교 방법을 사용하여 비교
                return o1.name.compareTo(o2.name);
            }
        };

        TreeSet<Person> personTreeSet = new TreeSet<>(nameComparator);

        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("임꺽정", 40);
        Person person3 = new Person("전우치", 20);
        Person person4 = new Person("이몽룡", 30);

        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        for (Person person : personTreeSet) {
            System.out.println(person);
        }
    }
}
