package inheritance.ex;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요! 제 이름은 " + name + "입니다. 저는 " + age + "살이고, ");
    }
}
