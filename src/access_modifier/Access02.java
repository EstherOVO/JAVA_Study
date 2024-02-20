package access_modifier;

public class Access02 {
    public static void main(String[] args) {

        Car car = new Car();

        car.speedUp();
        car.speedDown();
        car.speedDown();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();

//      현재 속도를 가져온다.
        int currentSpeed = car.getSpeed();  // car.speed : 4
        System.out.println(currentSpeed);

//      현재 속도를 설정한다
        car.setSpeed(119);                  // car.speed : 119
        System.out.println(currentSpeed);   // currentSpeed = 4

        car.speedUp();      // car.speed : 120
        car.speedUp();
    }
}
