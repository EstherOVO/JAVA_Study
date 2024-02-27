package interface00.ex.ex03;

public class Mage extends Character implements Attackable {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(name + "가(이) " + character.name + "을(를) 공격합니다! 마법의 힘 =+=");
    }
}
