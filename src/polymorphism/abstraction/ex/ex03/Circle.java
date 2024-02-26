package polymorphism.abstraction.ex.ex03;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = radius * radius * Math.PI;
        System.out.println("원의 면적 : " +  area);
    }
}
