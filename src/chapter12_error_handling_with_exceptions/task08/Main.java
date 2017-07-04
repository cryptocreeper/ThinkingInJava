package chapter12_error_handling_with_exceptions.task08;

public class Main {
    public static void main(String[] args) throws MyException {
        throw new MyException("exception in dangerous method");
    }
}