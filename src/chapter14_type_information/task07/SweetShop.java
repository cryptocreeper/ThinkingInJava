package chapter14_type_information.task07;

public class SweetShop {
    public static void main(String[] args) {
        for (String className : args) {
            try {
                Class.forName("chapter14_type_information.task07." + className);
            } catch (ClassNotFoundException e) {
                System.out.println("Не удалось найти " + className);
            }
        }
    }
}
