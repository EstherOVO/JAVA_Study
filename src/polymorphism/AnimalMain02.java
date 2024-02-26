package polymorphism;

public class AnimalMain02 {

    public static void main(String[] args) {

//      해결해야 할 문제
//      1. 동물이라는 추상적 개념을 직접 생성해서 사용할 수 있는 문제
        Animal a = new Animal();

//      2. 상속받은 메소드에서 해당 메소드를 오버라이딩 하지 않은 문제
        Animal[] animals = {new Dog(), new Cat(), new Dog(), a, new Chicken()};

        for (Animal animal :  animals) {
            animal.sound();
        }
    }
}
