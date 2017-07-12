package chapter13_strings.task08;

import java.util.Arrays;

public class Main {
    private static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... with... a herring!";

    public static void main(String[] args) {
        System.out.println(Arrays.asList(knights.split("the | you")));
    }
}
