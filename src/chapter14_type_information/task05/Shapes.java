package chapter14_type_information.task05;

public class Shapes {
    private static void rotate(Shape shape) {
        if (shape instanceof Circle) return;
        else System.out.println("rotate " + shape);
    }

    public static void main(String[] args) {
        rotate(new Triangle());
        rotate(new Square());
        rotate(new Circle());
    }
}
