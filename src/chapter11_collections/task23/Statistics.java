package chapter11_collections.task23;

import java.util.*;

class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> maximumsMap = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 10000; j++) {
                int randomInt = random.nextInt(20);
                Integer freq = map.get(randomInt);
                map.put(randomInt, freq == null ? 1 : freq + 1);
            }
            Integer maxKey = findMaxInMap(map);
            Integer existingMaxValue = maximumsMap.get(maxKey);
            maximumsMap.put(maxKey, existingMaxValue == null ? 1 : existingMaxValue + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(maximumsMap.keySet());
        Collections.sort(keys);
        for (Integer key : keys) System.out.println("Number " + key + " repeats " + maximumsMap.get(key) + " times");
    }

    private static int findMaxInMap(Map<Integer, Integer> map) {
        Set<Integer> keySet = map.keySet();
        int keyWithMaxValue = 0;

        for (int key : keySet) {
            if (map.get(key) > map.get(keyWithMaxValue)) keyWithMaxValue = key;
        }

        return keyWithMaxValue;
    }
}
