package javadoc;

public class JavaDoc {
    public static void main(String[] args) {

//      JavaDoc 으로 추가한 경우 사용할 때 클래스, 생성자, 메서드 등에서 설명을 확인할 수 있다.
        Polygon polygon = new Polygon(3);

        double angle = polygon.getInnerAngle();
        int perimeter = polygon.getPerimeter(10);

        System.out.println(String.format("삼각형의 내각은 %.0f도 입니다.", angle));
        System.out.println(String.format("삼각형의 둘레는 %d 입니다.", perimeter));

        Human human = new Human("홍길동", 30);

        human.introduce();  // deprecate 된 메서드
        human.intro();
    }
}
