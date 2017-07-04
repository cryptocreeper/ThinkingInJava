package chapter12_error_handling_with_exceptions.task06;

public class SecondException extends Exception {
    private String information = "I am a second exception";

    public SecondException() {
        System.out.println(information);
    }

    public SecondException(String message) {
        super(message);
        System.out.println(information);
    }
}
