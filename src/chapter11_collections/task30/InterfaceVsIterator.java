package chapter11_collections.task30;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {
    public static void display(Iterator<Person> iterator) {
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.print(person + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Person> collection) {
        for (Person person : collection) {
            System.out.print(person + " ");
        }
        System.out.println();
    }
}
