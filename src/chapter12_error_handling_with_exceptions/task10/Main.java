package chapter12_error_handling_with_exceptions.task10;

public class Main {
    static void f() throws Exception2 {
        try {
            g();
        } catch (Exception1 e) {
            throw new Exception2();
        }
    }

    static void g() throws Exception1 {
        throw new Exception1();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception2 e) {
            e.printStackTrace();
        }
    }
}
