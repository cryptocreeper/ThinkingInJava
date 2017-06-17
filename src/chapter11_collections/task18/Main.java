package chapter11_collections.task18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(11, "one");
        hashMap.put(53, "two");
        hashMap.put(75, "three");
        hashMap.put(81, "four");
        hashMap.put(99, "five");

        // Ordered by hash
        System.out.println(hashMap);

        ArrayList<Integer> keys = new ArrayList<>(hashMap.keySet());
        Collections.sort(keys);

        for (int key : keys)
            linkedHashMap.put(key, hashMap.get(key));

        // Ordered by key
        System.out.println(linkedHashMap);
    }
}
