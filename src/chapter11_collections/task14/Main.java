package chapter11_collections.task14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            ListIterator<Integer> listIterator = list.listIterator(list.size() / 2);
            listIterator.add(i);
        }

        System.out.println(list);
    }
}
