package chapter12.task25;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.method();
        } catch (SuperException e) {
            e.printStackTrace();
        }
    }
}
