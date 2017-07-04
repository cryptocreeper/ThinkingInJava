package chapter12_error_handling_with_exceptions.task07;

public class Main {
    public static void main(String[] args) {
        try {
            String[] strings = new String[5];
            strings[10] = "Hello!";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}