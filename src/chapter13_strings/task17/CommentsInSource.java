package chapter13_strings.task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Program arguments for example:
    src/chapter13_strings/task17/CommentsInSource.java */

public class CommentsInSource {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) System.exit(0);

        Pattern p = Pattern.compile("(//.*$)|(/\\*.*\\*/)|(/\\*.*)|(.*\\*/)");
        Matcher m = p.matcher("");

        int lineNumber = 0;

        for (String line : new TextFile(args[0])) {
            lineNumber++;
            m.reset(line);
            while (m.find())
                System.out.println("line " + lineNumber + " position " + m.start() + "   " + m.group());
        }
    }
}
