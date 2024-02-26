package polymorphism.abstraction.ex.ex01;

public class Car {

    Tire frontLeftTire = new Tire("앞 왼쪽 타이어", 2);
    Tire frontRightTire = new Tire("앞 오른쪽 타이어", 6);
    Tire backLeftTire = new Tire("뒤 왼쪽 타이어", 5);
    Tire backRightTire = new Tire("뒤 오른쪽 타이어", 3);

    public int run() {
        if (frontLeftTire.roll() == false) {
            stop(); return 1;
        }
        if (frontRightTire.roll() == false) {
            stop(); return 2;
        }
        if (backLeftTire.roll() == false) {
            stop(); return 3;
        }
        if (backRightTire.roll() == false) {
            stop(); return 4;
        }
        return 0;
    }

    public void stop() {
        System.out.println("[자동차를 멈춥니다.]");
    }
}
