package chapter11_collections.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);

        ListIterator<Integer> listIterator = list1.listIterator(list1.size());
        while (listIterator.hasPrevious())
            list2.add(listIterator.previous());
        System.out.println(list2);
    }
}
