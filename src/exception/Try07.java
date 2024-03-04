package exception;

public class Try07 {

    static class Animal {}

    static class Dog extends Animal {}
    static class Cat extends Animal {}

    public static void main(String[] args) {

//      ClassCastException : 불가능한 다운 캐스팅 시도 시 발생
        Dog dog = new Dog();
        Cat cat = new Cat();

        changeDog(dog);
        changeDog(cat); // 예외 발생 가능 코드 : ClassCastException
    }

    static void changeDog(Animal animal) {
//      instanceof 연산자로 타입 체크 후 예외 처리
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
    }
}
