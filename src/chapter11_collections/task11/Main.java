package chapter11_collections.task11;

import java.util.*;

public class Main {

    public static void display(Iterator iterator) {
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, new Person("Jack"), new Person("Frank"), new Person("Adam"));
        display(arrayList.iterator());

        LinkedList<Person> linkedList = new LinkedList<>(arrayList);
        display(linkedList.iterator());

        HashSet<Person> hashSet = new HashSet<>(arrayList);
        display(hashSet.iterator());
    }

}
