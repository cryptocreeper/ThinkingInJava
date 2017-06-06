package chapter11_collections.task02;

import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++)
            set.add(i);   // Автоматическая упаковка
        for (Integer i : set)
            System.out.print(i + ", ");
    }
}