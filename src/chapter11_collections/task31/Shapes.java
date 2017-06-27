package chapter11_collections.task31;

public class Shapes {
    private static RandomShapeGenerator generator = new RandomShapeGenerator(10);

    public static void main(String[] args) {
        for (Shape shape : generator) shape.draw();
    }
}
