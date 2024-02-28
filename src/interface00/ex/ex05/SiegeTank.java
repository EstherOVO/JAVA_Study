package interface00.ex.ex05;

public class SiegeTank implements Character, Attackable {

    @Override
    public String setCharacterName() {
        return "시저탱크";
    }

    @Override
    public void attack() {
        System.out.println(setCharacterName() + "가 포를 쏩니다.");
    }
}
