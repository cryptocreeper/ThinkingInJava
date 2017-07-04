package chapter12_error_handling_with_exceptions.task08;

public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
