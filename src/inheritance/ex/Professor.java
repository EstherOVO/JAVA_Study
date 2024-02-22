package inheritance.ex;

public class Professor extends Person {

    protected String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("안녕하세요! 제 이름은 " + name + "입니다. 저는 " + age + "살이고, " + department + " 학과에서 근무합니다.");
    }
}
