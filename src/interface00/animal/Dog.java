package interface00.animal;

// 인터페이스를 상속받을 때는 extends(확장)가 아닌, implements(구현)라는 키워드를 사용한다.
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 폴짝폴짝 움직입니다.");
    }
}
