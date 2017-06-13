package chapter11_collections.task09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {

    private List<Object> items;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Iterator<Object> iterator = sequence.items.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
