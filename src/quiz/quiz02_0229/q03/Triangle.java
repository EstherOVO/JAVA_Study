package quiz.quiz02_0229.q03;

public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double area = base * height * 1/2;
        System.out.println("▲ 삼각형의 면적 : " + area);
    }
}
