package chapter11_collections.task16;

import java.util.*;
import java.nio.file.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task16/SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "A a E e I i O o U u Y y".split(" "));

        int totalVowelsCount = 0;

        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0) {
                    int wordVowelsCount = 0;
                    for (int i = 0; i < word.length(); i++)
                        if (vowels.contains(Character.toString(word.charAt(i)))) wordVowelsCount++;
                    totalVowelsCount += wordVowelsCount;

                    System.out.println("Word \"" + word + "\" contains " + wordVowelsCount + " vowels");
                }

        System.out.println("Total vowels count in file: " + totalVowelsCount);
    }
}