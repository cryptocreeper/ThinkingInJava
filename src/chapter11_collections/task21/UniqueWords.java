package chapter11_collections.task21;

import java.nio.file.*;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task21/SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Map<String, Integer> words = new HashMap<>();

        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0) {
                    if (words.get(word) == null) words.put(word, 1);
                    else words.put(word, words.get(word) + 1);
                }

        ArrayList<String> keys = new ArrayList<>(words.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);

        for (String key : keys)
            System.out.println(key + ": " + words.get(key));
    }
}