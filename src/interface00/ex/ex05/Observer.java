package interface00.ex.ex05;

public class Observer implements Character, Movable {

    @Override
    public String setCharacterName() {
        return "옵저버";
    }

    @Override
    public void move() {
        System.out.println(setCharacterName() + "가 떠다닙니다.");
    }
}

