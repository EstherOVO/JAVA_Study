package polymorphism.abstraction.ex.ex03;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double area = width * height;
        System.out.println("사각형의 면적 : " +  area);
    }
}
