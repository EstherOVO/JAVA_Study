package interface00.car.poly;

public class Driver {

//  구체적인 것에 의존하는 대신 추상적인 것(인터페이스와 역할)에 의존한다.
//  차량이 추가되어도 코드가 변경되지 않는다.

//  필드
    private Car car;

//  생성자
//  자동차를 설정
    public void setCar(Car car) { this.car = car; }

//  운전
//  차량이 추가되어도 코드가 변경되지 않는다.
    void drive() {
        car.onEngine();
        car.pressAccel();
        car.pressBreak();
        car.offEngine();
    }
}
