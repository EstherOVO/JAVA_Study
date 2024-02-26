package polymorphism.abstraction.ex.ex01;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();

        for (int i = 0; i < 5; i++) {
            System.out.println("[자동차가 달립니다.]");
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1 :
                    System.out.println("앞 왼쪽 타이어를 한국 타이어로 교체합니다.");
                    car.frontLeftTire = new HankookTire("앞 왼쪽 타이어", 10);
                    break;
                case 2 :
                    System.out.println("앞 오른쪽 타이어를 금호 타이어로 교체합니다.");
                    car.frontLeftTire = new HankookTire("앞 오른쪽 타이어", 15);
                    break;
                case 3 :
                    System.out.println("뒤 왼쪽 타이어를 한국 타이어로 교체합니다.");
                    car.frontLeftTire = new HankookTire("뒤 왼쪽 타이어", 15);
                    break;
                case 4 :
                    System.out.println("뒤 오른쪽 타이어를 한국 타이어로 교체합니다.");
                    car.frontLeftTire = new HankookTire("앞 오른쪽 타이어", 10);
                    break;
            }
            System.out.println("======================");
        }
    }
}
