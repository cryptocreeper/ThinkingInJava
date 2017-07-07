package chapter12_error_handling_with_exceptions.task15;

public class WithFinally {
    private static Switch sw = new Switch();

    private static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
