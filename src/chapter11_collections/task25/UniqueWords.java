package chapter11_collections.task25;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task25/SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        Map<String, ArrayList<Integer>> words = new HashMap<>();
        int wordNumber = 1;

        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0) {
                    ArrayList<Integer> wordPositions = words.get(word);
                    if (wordPositions == null) wordPositions = new ArrayList<>();
                    wordPositions.add(wordNumber++);
                    words.put(word, wordPositions);
                }

        System.out.println(words);
    }
}