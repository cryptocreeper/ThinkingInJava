package chapter12_error_handling_with_exceptions.task06;

public class Main {
    public static void main(String[] args) {
        try {
            throw new FirstException();
        } catch (FirstException e) {
            e.printStackTrace();
        }
        try {
            throw new SecondException();
        } catch (SecondException e) {
            e.printStackTrace();
        }
    }
}
