package chapter14_type_information.task09;

import javafx.scene.layout.VBox;

import java.lang.reflect.Field;

public class Main {
    static void printClass(Class objectClass) {
        System.out.println(objectClass.getSimpleName());
        for (Field field : objectClass.getDeclaredFields()) {
            System.out.println("  " + field.getName());
        }
        System.out.println();

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
