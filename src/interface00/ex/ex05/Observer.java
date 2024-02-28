package interface00.ex.ex05;

public class Observer implements Movable {

    final String name = "옵저버";

    @Override
    public void move() {
        System.out.println(name + "가 떠다닙니다.");
    }
}

