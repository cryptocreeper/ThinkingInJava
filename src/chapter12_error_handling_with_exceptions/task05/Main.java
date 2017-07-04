package chapter12_error_handling_with_exceptions.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("before calling method");

        int count = -23;

        while (true) {
            try {
                Apple apple = new Apple(count);
                break;
            } catch (WrongCountException e) {
                System.out.println(e.getMessage());
                count += 5;
            }
        }

        System.out.println("after calling method");
    }
}
