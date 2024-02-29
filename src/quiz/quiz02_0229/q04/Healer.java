package quiz.quiz02_0229.q04;

public class Healer extends Character implements Healable {

    public Healer(String characterName) {
        super(characterName);
    }

    @Override
    public void heal(Character character) {
        System.out.println("<" + characterName + ">님이 <" + character.characterName + ">님을 치유합니다! 맑은 치유 §");
    }
}
