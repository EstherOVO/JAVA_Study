package interface00.diamond;

public class ImplClass implements First, Second {

//  First 인터페이스에서 가져온 메소드(메소드 본문은 구현 클래스에서 구현)
    @Override
    public void firstMethod() {
        System.out.println("첫 번째 메소드");
    }

//  Second 인터페이스에서 가져온 메소드(메소드 본문은 구현 클래스에서 구현)
    @Override
    public void secondMethod() {
        System.out.println("두 번째 메소드");
    }

//  First, Second 양쪽 인터페이스에서 가져온 메소드(메소드 본문은 구현 클래스에서 구현 → 다이아몬드 문제가 발생하지 않는다.)
    @Override
    public void commonMethod() {
        System.out.println("첫 번째와 두 번째의 공통 메소드");
    }
}
