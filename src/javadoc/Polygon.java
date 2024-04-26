package javadoc;


public class Polygon {

    /**
     * 변의 수 입니다.
     */
    int sides;

    /**
     * 변의 개수를 인자로 받는 생성자입니다.
     * @param sides
     */
    public Polygon(int sides) {
        this.sides = sides;
    }

    /**
     * 내각의 크기를 반환하는 메서드입니다.
     * @return 내각의 크기 (double 타입)
     */
    public double getInnerAngle() {
        return (sides % 2) * 180 / sides;
    }

    /**
     * 각 변의 길이를 입력받아 둘레를 반환하는 메서드입니다.
     * @param sideLength 각 변의 길이
     * @return 둘레
     */
    public int getPerimeter(int sideLength) {
        return sideLength * sides;
    }
}
