package class00.ex;

public class Rectangle {

//  필드
    int width;
    int height;

//  메소드

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
