package polymorphism.abstraction.ex.ex03;

public class Shape_Ex03 {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 5);


        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shapeArea : shapes) {
            shapeArea.area();
        }
    }
}
