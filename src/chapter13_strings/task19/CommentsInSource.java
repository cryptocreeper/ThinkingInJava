package chapter13_strings.task19;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Program arguments for example:
    src/chapter13_strings/task19/TextFile.java */

public class CommentsInSource {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) System.exit(0);

        Pattern p = Pattern.compile("\\b[A-Z]\\w*\\b");
        Matcher m = p.matcher("");

        Set<String> classes = new TreeSet<>();
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                classes.add(m.group());
        }

        System.out.println(classes);
    }
}