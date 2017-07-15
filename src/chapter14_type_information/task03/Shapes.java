package chapter14_type_information.task03;

public class Shapes {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;
        rhomboid = (Rhomboid)shape;

        // not compiled
        // Circle circle = shape;

        // ClassCastException
        Circle circle = (Circle)shape;
    }
}
