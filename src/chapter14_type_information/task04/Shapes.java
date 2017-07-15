package chapter14_type_information.task04;

public class Shapes {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
        } else if (shape instanceof Rhomboid) {
            Rhomboid newRhomboid = (Rhomboid) shape;
        }
    }
}
