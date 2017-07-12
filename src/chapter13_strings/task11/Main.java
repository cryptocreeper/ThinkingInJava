package chapter13_strings.task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Arline ate eight apples and one orange while Anita hadn't any";
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group().equals("")) continue;
            System.out.println("Match \"" + matcher.group() + "\" at positions " +
                    matcher.start() + "-" + (matcher.end() - 1));
        }
    }
}
