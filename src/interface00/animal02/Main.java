package interface00.animal02;

import inheritance.final_keyword.A;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

//      Animal 클래스를 상속받은 클래스만 가능
        sound(cat);
        sound(sparrow);
        sound(penguin);

//      Flyable 인터페이스를 상속받은 클래스만 가능
        fly(sparrow);
        fly(penguin);
//      fly(cat);


//      static 메소드 대신 배열을 통해 나타내기
        Animal[] animals = {cat, sparrow, penguin};
        for (Animal animal : animals) {
            animal.sound();
        }

        Flyable[] flyables = {sparrow, penguin};
        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }

    static void sound(Animal animal) {
        animal.sound();
    }

    static void fly(Flyable flyable) {
        flyable.fly();
    }

    static void swim(Swimable swimable) {
        swimable.swim();
    }
}
