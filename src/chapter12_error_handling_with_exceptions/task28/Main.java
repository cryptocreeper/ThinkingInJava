package chapter12_error_handling_with_exceptions.task28;

public class Main {
    private static void dangerousMethod() throws MyException {
        throw new MyException("exception in dangerous method");
    }

    public static void main(String[] args) {
        dangerousMethod();
    }
}
