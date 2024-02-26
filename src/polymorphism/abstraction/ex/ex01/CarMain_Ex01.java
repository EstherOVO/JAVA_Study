package polymorphism.abstraction.ex.ex01;

public class CarMain_Ex01 {
    public static void main(String[] args) {

        Car car = new Car();

        for (int i = 0; i < 5; i++) {
            System.out.println("[자동차가 달립니다.]");
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1 :
                    System.out.println(car.frontLeftTire.location + "를 한국 타이어로 교체합니다.");
                    car.frontLeftTire = new HankookTire("앞 왼쪽 타이어", 10);
                    break;
                case 2 :
                    System.out.println(car.frontRightTire.location + "를 금호 타이어로 교체합니다.");
                    car.frontRightTire = new KumhoTire("앞 오른쪽 타이어", 15);
                    break;
                case 3 :
                    System.out.println(car.backLeftTire.location + "를 한국 타이어로 교체합니다.");
                    car.backLeftTire = new HankookTire("뒤 왼쪽 타이어", 15);
                    break;
                case 4 :
                    System.out.println(car.backRightTire.location + "를 금호 타이어로 교체합니다.");
                    car.backRightTire = new KumhoTire("앞 오른쪽 타이어", 10);
                    break;
            }
            System.out.println("======================");
        }
    }
}
