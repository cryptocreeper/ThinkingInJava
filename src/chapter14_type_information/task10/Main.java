package chapter14_type_information.task10;

public class Main {
    public static void main(String[] args) {
        char[] chars = new char[10];
        Class charArrayClass = chars.getClass();
        System.out.println(charArrayClass.getSimpleName());
        System.out.println(charArrayClass.getSuperclass());
    }
}
