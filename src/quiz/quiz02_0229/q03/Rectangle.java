package quiz.quiz02_0229.q03;

public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void area() {
        double area = width * length;
        System.out.println("■ 사각형의 면적 : " + area);
    }
}
