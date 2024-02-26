package polymorphism.abstraction.ex.ex01;

public class HankookTire extends Tire {

    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        accumulatedRotation++;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " 타이어 정상 ▶ 남은 한국 타이어 수명 : " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println("※ " + location + " 타이어 펑크 ※");
            return false;
        }
    }
}
