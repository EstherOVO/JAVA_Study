package interface00.ex.ex05;

public class SupplyDepot implements Character {

    @Override
    public String setCharacterName() {
        return "서플라이 디폿";
    }

    public void provideSupply() {
        System.out.println(setCharacterName() + "이 지원을 제공합니다.");
    }
}
