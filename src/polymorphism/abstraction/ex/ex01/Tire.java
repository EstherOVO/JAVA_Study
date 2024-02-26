package polymorphism.abstraction.ex.ex01;

public class Tire {

    String location;
    int maxRotation;
    int accumulatedRotation;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        accumulatedRotation++;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " 타이어 정상 ▶ 남은 타이어 수명 : " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println("※ " + location + " 타이어 펑크 ※");
            return false;
        }
    }
}
