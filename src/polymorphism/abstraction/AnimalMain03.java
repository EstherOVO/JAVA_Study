package polymorphism.abstraction;

public class AnimalMain03 {
    public static void main(String[] args) {

//      Animal animal = new Animal();   추상 클래스는 인스턴스화 될 수 없다. → 생성 제약

//      1. 추상적인 상위 메소드 생성 문제 해결
        Animal[] animals = {new Dog(), new Cat(), new Pig(), new Chicken()};
//      2. 추상 메소드로 오버라이딩 되지 않는 문제 해결

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
