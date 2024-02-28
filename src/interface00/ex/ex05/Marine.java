package interface00.ex.ex05;

public class Marine implements Character, Attackable, Movable {

    @Override
    public String setCharacterName() {
        return "마린";
    }

    @Override
    public void attack() {
        System.out.println(setCharacterName() + "이 총을 쏩니다.");
    }

    @Override
    public void move() {
        System.out.println(setCharacterName() + "이 이동합니다.");
    }

}
