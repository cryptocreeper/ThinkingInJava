package chapter11_collections.task26;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task26/SetOperations.java";
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

        // Restoration of word order
        Set<String> keys = words.keySet();
        wordNumber = 0;

        outer: while (true) {
            wordNumber++;
            for (String key : keys) {
                ArrayList<Integer> wordPositions = words.get(key);
                for (int position : wordPositions) {
                    if (position == wordNumber) {
                        System.out.print(key + " ");
                        continue outer;
                    }
                }
            }
            break;
        }
    }
}