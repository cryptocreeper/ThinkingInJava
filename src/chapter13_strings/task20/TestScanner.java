package chapter13_strings.task20;

import java.util.Scanner;

public class TestScanner {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public TestScanner(String text) {
        Scanner scanner = new Scanner(text);
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        s = scanner.next();
    }

    @Override
    public String toString() {
        return String.format("int: %d\nlong: %d\nfloat: %f\ndouble: %f\nstring: %s", i, l, f, d, s);
    }
}
