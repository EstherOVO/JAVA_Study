package class01.ex;

public class Person {

    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void printInfo() {
        System.out.println("==============");
        System.out.println("이름 : " + Person.this.name + "\n나이 : " + Person.this.age + "\n성별 : " + Person.this.gender);
    }
}

