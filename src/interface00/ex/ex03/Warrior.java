package interface00.ex.ex03;

public class Warrior extends Character implements Attackable {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(name + "가(이) " + character.name + "을(를) 공격합니다. 날카로운 공격! =/=");
    }
}
