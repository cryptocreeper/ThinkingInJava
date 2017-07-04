package chapter12_error_handling_with_exceptions.task01;

public class Main {
    private static void dangerousMethod() throws Exception {
        throw new Exception("exception in dangerous method");
    }

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }
}
