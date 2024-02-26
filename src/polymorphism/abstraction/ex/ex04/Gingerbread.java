package polymorphism.abstraction.ex.ex04;

public class Gingerbread extends Cookie {

    @Override
    public void run() { System.out.println("생강빵 맨이 달립니다! ■_□ =@"); }

    public void jump() { System.out.println("생강빵 맨이 아주 높게 점프합니다! ■_□ ↑↑↑"); }

    public void specialSkill() { System.out.println("생강빵 맨이 진저 향을 퍼뜨립니다! ■_□ ~*"); }

    public void allSkills() {
        run();
        jump();
        specialSkill();
    }
}
