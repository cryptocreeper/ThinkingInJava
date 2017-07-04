package chapter12_error_handling_with_exceptions.task06;

public class FirstException extends Exception {
    private String information = "I am a first exception";

    public FirstException() {
        System.out.println(information);
    }

    public FirstException(String message) {
        super(message);
        System.out.println(information);
    }
}
