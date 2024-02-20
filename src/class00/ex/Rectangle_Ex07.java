package class00.ex;

public class Rectangle_Ex07 {
    public static void main(String[] args) {

//      사각형의 넓이와 둘레, 정사각형 여부를 구하는 절차적 코드입니다.
//      사각형 클래스를 만들어 객체지향적 코드로 변경해 주세요.

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);
    }
}
