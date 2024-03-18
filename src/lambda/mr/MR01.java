package lambda.mr;

public class MR01 {
    public static void main(String[] args) {

        Person person = new Person();
//      person.action((x, y) -> Computer.staticMethod(x, y));
        person.action(Computer::staticSumMethod);

        Computer computer = new Computer();
        person.action(computer::instanceMultiMethod);
    }
}
