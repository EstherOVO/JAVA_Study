package quiz.quiz02_0229.q04;

public class Warrior extends Character implements Attackable {

    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void attack(Character character) {
        System.out.println("<" + characterName + ">님이 <" + character.characterName + ">님을 공격합니다! 날카로운 공격 §");
    }
}
