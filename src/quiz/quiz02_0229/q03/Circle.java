package quiz.quiz02_0229.q03;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area = radius * radius * Math.PI;
        System.out.println("● 원의 면적 : " + area);
    }
}
