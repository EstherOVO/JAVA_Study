package interface00.animal02;

public class Penguin extends Animal implements Swimable {

    @Override
    public void sound() {
        System.out.println("펭펭");
    }

    @Override
    public void swim() {
        System.out.println("펭귄이 수영을 하고 있습니다.");
    }
}
