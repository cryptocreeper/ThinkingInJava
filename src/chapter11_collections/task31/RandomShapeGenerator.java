package chapter11_collections.task31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private int count;

    public RandomShapeGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            private Random random = new Random();

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public Shape next() {
                index++;
                switch(random.nextInt(3)) {
                    default:
                    case 0: return new Circle();
                    case 1: return new Square();
                    case 2: return new Triangle();
                }
            }
        };
    }
}