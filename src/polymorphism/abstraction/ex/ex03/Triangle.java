package polymorphism.abstraction.ex.ex03;

public class Triangle extends Shape {

    double width;
    double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double area = width * height * 1/2;
        System.out.println("삼각형의 면적 : " +  area);
    }
}
