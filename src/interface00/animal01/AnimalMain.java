package interface00.animal01;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        sound(cat);
        sound(dog);

        move(cat);
        move(dog);
    }

//  매개 변수로 Animal 인터페이스를 받는다.
//  인터페이스를 구현한 클래스들을 다형적 매개 변수로 받을 수 있다.
    static void sound(Animal animal) {
        animal.sound();
    }

    static void move(Animal animal) {
        animal.move();
    }
}
