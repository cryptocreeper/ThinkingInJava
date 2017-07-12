package chapter13_strings.task06;

public class Main {
    private int intValue = 10;
    private long longValue = 123456789012345L;
    private float floatValue = 0.12345F;
    private double doubleValue = 0.123456789;

    @Override
    public String toString() {
        return String.format("int value: %d\nlong value: %d\nfloat value: %f\ndouble value: %f",
                intValue, longValue, floatValue, doubleValue);
    }

    public static void main(String[] args) {
        System.out.println(new Main());
    }
}
