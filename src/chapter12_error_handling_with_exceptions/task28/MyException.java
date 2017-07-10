package chapter12_error_handling_with_exceptions.task28;

public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
