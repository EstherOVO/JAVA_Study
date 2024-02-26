package polymorphism.abstraction.ex.ex04;

public class ChocoCookie extends Cookie {

    @Override
    public void run() {
        System.out.println("초코 쿠키 맨이 달립니다! ●v● =@");
    }

    public void jump() {
        System.out.println("초코 쿠키 맨이 높게 점프합니다! ●v● ↑↑");
    }

    public void specialSkill() {
        System.out.println("초코 쿠키 맨이 초콜릿을 먹고 힘을 냅니다! ♡* ●v● *♡");
    }
}
