package chapter11_collections.task22;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/chapter11_collections/task22/SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Set<Word> words = new HashSet<>();

        for(String line : lines)
            for(String word : line.split("\\W+"))
                if (word.trim().length() > 0) {
                    Word existingWord = getWordFromSet(words, word);
                    if (existingWord == null) words.add(new Word(word));
                    else existingWord.increaseCount();
                }

        System.out.println(words);
    }

    private static Word getWordFromSet(Set<Word> set, String searchWord) {
        for (Word word : set) {
            if (word.getWord().equals(searchWord)) return word;
        }
        return null;
    }
}
