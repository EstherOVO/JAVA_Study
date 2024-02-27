package polymorphism.pure;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();

        sound(cat);
        sound(dog);
        sound(mouse);
        sound(tiger);

        move(cat);
        move(dog);
        move(mouse);
        move(tiger);

        tiger.eat();
    }

//  스태틱 메소드로 매개 변수의 다형성 구현
//  동물이 추가되어도 코드가 변경되지 않는다.
    public static void sound(Animal animal) {
        animal.sound();
    }

    public static void move(Animal animal) {
        animal.move();
    }

//  다형성이 적용되지 않았을 때...
//  동물이 추가되면 코드를 변경해야 한다.
    static void soundCat(Cat cat) {
        cat.sound();
    }

    static void soundDog(Dog dog) {
        dog.sound();
    }

    static void soundMouse(Mouse mouse) {
        mouse.sound();
    }
}
