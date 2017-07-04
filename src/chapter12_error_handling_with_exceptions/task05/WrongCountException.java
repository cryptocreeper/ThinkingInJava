package chapter12_error_handling_with_exceptions.task05;

public class WrongCountException extends Exception {
    public WrongCountException(String message) {
        super(message);
    }
}
