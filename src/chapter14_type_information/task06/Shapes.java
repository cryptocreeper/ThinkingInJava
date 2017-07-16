package chapter14_type_information.task06;

public class Shapes {
    static void setFlag(Shape shape, boolean value) {
        shape.setFlag(value);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        setFlag(triangle, true);
        setFlag(square, true);

        System.out.println(triangle);
        System.out.println(square);
        System.out.println(circle);
    }
}
