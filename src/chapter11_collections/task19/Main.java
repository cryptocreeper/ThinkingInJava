package chapter11_collections.task19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        hashSet.add(11);
        hashSet.add(53);
        hashSet.add(75);
        hashSet.add(81);
        hashSet.add(99);

        // Ordered by hash
        System.out.println(hashSet);

        ArrayList<Integer> setValues = new ArrayList<>(hashSet);
        Collections.sort(setValues);
        linkedHashSet.addAll(setValues);

        // Ordered by key
        System.out.println(linkedHashSet);
    }
}
