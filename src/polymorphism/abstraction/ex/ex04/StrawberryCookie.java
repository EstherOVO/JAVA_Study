package polymorphism.abstraction.ex.ex04;

public class StrawberryCookie extends Cookie {

    @Override
    public void run() {
        System.out.println("딸기 쿠키 맨이 달립니다! ♡^♡ =@");
    }

    public void jump() {
        System.out.println("딸기 쿠키 맨이 낮게 점프합니다! ♡^♡ ↑");
    }

    public void specialSkill() {
        System.out.println("딸기 쿠키 맨이 딸기 꼭지로 장애물을 설치했습니다! _* ♡^♡ *_");
    }

    public void allSkills() {
        run();
        jump();
        specialSkill();
    }
}
