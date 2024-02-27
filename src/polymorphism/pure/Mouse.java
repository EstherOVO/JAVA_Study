package polymorphism.pure;

public class Mouse extends Animal {
    @Override
    public void sound() {
        System.out.println("쮝쮝");
    }

    @Override
    public void move() {
        System.out.println("쥐가 재빠르게 움직입니다.");
    }
}
