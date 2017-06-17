package chapter11_collections.task17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("firstGerbil", new Gerbil(23));
        gerbils.put("secondGerbil", new Gerbil(64));
        gerbils.put("thirdGerbil", new Gerbil(12));

        Iterator<String> keysIterator = gerbils.keySet().iterator();

        while (keysIterator.hasNext()) {
            String key = keysIterator.next();
            System.out.print(key + ": ");
            gerbils.get(key).hop();
        }
    }
}
