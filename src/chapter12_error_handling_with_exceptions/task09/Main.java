package chapter12_error_handling_with_exceptions.task09;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throw new Exception2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throw new Exception3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
