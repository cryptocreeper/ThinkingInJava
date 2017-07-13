package chapter13_strings.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static String input =
        "Twas brillig, and the slithy toves\n" +
        "Did gyre and gimble in the wabe.\n" +
        "All mimsy were the borogoves,\n" +
        "And the mome raths outgrabe.\n\n" +
        "Beware the Jabberwock, my son,\n" +
        "The jaws that bite, the claws that catch.\n" +
        "Beware the Jubjub bird, and shun\n" +
        "The frumious Bundersnatch.";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        public Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find())
            d.display("find() '" + m.group() + "' start = " + m.start() + " end " + m.end());

        if (m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());

        if (m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n+")) {
            System.out.println("input: " + in);
            for (String regex : new String[]{"\\b\\w.+[.,]?", "[Tt]he"})
                examine(in, regex);
        }
    }
}
