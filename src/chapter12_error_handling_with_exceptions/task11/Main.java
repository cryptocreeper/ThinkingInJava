package chapter12_error_handling_with_exceptions.task11;

public class Main {
    static void f() throws MyException {
        try {
            g();
        } catch (Exception e) {
            throw new MyException();
        }
    }

    static void g() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
