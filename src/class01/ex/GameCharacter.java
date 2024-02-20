package class01.ex;

public class GameCharacter {

    String name;
    int level;
    int health;

    GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    void attack() {
        System.out.print(name + " attack! ▶ ");
    }

    void takeDamage(int damage) {
        this.health -= damage;
        if (health > 0) {
            System.out.println(name + "의 현재 생명력 § : " + health);
        } else if (health == 0) {
            System.out.println(name + "님의 패배로 게임을 종료합니다.");

        }
    }
}
