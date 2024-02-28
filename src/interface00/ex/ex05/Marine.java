package interface00.ex.ex05;

public class Marine implements Attackable, Movable {

    final String name = "마린";

    @Override
    public void attack() {
        System.out.println(name + "이 총을 쏩니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이 이동합니다.");
    }

}
