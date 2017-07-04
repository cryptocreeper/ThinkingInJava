package chapter12_error_handling_with_exceptions.task02;

public class Main {
    public static void main(String[] args) {
        Integer intNumber = null;
        try {
            long longNumber = intNumber.longValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
