package chapter11_collections.task20;

import java.nio.file.*;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task20/SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        Map<String, Integer> vowels = new HashMap<>();
        String[] vowelsArray = "A a E e I i O o U u Y y".split(" ");
        for (String key : vowelsArray) vowels.put(key, 0);

        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0)
                    for (int i = 0; i < word.length(); i++) {
                        String key = Character.toString(word.charAt(i));
                        if (vowels.get(key) != null)
                            vowels.put(key, vowels.get(key) + 1);
                    }

        System.out.println(vowels);
    }
}