package inheritance;

public class ElectricCar extends Car {

    ElectricCar() {
//      System.out.println("ElectricCar 생성자 호출");
    }

//  부모 요소를 덮어쓸 때 overriding을 사용한다.
//  @Overring라는 특별한 주석을 붙이면 컴파일러가 메소드가 정확하게 오버라이딩 되었는지 확인을 한다.
//  (→ @Overring 사용 시 부모 클래스에서 찾아 진짜 그 메소드가 부모 클래스 안에 있는지 확인해 준다.)
    @Override
    public void move() {
        System.out.println("전기차가 조용하게 이동합니다.");
    }

    public void charge() {
        System.out.println("전기차 배터리를 충전합니다.");
    }
}
