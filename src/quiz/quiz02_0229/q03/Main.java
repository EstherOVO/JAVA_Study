package quiz.quiz02_0229.q03;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);
        Triangle triangle = new Triangle(5, 3);

        Shape[] shapes = {circle, rectangle, triangle};
        getArea(shapes);

    }

    static void getArea(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.area();
        }
    }
}
