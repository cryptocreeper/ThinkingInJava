package chapter14_type_information.task08;

import javafx.scene.layout.VBox;

public class Main {
    static void printClass(Class objectClass) {
        System.out.println(objectClass.getSimpleName());

        Class superClass = objectClass.getSuperclass();
        if (superClass != null) printClass(superClass);
    }

    public static void main(String[] args) {
        Integer integer = 5;
        printClass(integer.getClass());
        System.out.println();

        VBox vBox = new VBox();
        printClass(vBox.getClass());
    }
}
