package chapter11_collections.task24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("John", "John");
        map.put("Jack", "Jack");
        map.put("Kate", "Kate");
        map.put("Sam", "Sam");
        map.put("Dan", "Dan");

        // Before order
        System.out.println(map);

        Map<String, String> tempMap = new HashMap<>(map);
        map.clear();

        ArrayList<String> keys = new ArrayList<>(tempMap.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);

        for (String key : keys)
            map.put(key, tempMap.get(key));

        // After order
        System.out.println(map);
    }
}
