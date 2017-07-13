package chapter13_strings.task12;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM =
        "Twas brillig, and the slithy toves\n" +
        "Did gyre and gimble in the wabe.\n" +
        "All mimsy were the borogoves,\n" +
        "And the mome raths outgrabe.\n\n" +
        "Beware the Jabberwock, my son,\n" +
        "The jaws that bite, the claws that catch.\n" +
        "Beware the Jubjub bird, and shun\n" +
        "The frumious Bundersnatch.";

    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();
        Matcher matcher = Pattern.compile("\\b[a-z]\\w+").matcher(POEM);
        while (matcher.find()) words.add(matcher.group());
        System.out.println(words);
    }
}
