package chapter13_strings.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String text = "Java now has regular expressions";

    private static void printMatch(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("For text: \"" + text + "\" using regex: \"" + regex + "\"");

        String result = "";
        while (matcher.find()) {
            if (matcher.group().equals("")) continue;
            result += "Match \"" + matcher.group() + "\" at positions " +
                    matcher.start() + "-" + (matcher.end() - 1) + '\n';
        }

        if (!result.equals("")) System.out.println(result);
        else System.out.println("No matches\n");
    }

    public static void main(String[] args) {
        printMatch(text, "^Java");
        printMatch(text, "\\Breg.*");
        printMatch(text, "n.w\\s+h(a|i)s");
        printMatch(text, "s?");
        printMatch(text, "s*");
        printMatch(text, "s+");
        printMatch(text, "s{4}");
        printMatch(text, "s{1}");
        printMatch(text, "s{0,3}");
    }
}
