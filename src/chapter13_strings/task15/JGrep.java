package chapter13_strings.task15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Program arguments for example:
// src/chapter13_strings/task15/JGrep.java \b[sct]\w+ CASE_INSENSITIVE

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        int flag = -1;
        if (args.length == 3) {
            switch (args[2]) {
                case "CANON_EQ": flag = Pattern.CANON_EQ; break;
                case "CASE_INSENSITIVE": flag = Pattern.CASE_INSENSITIVE; break;
                case "COMMENTS": flag = Pattern.COMMENTS; break;
                case "DOTALL": flag = Pattern.DOTALL; break;
                case "MULTILINE": flag = Pattern.MULTILINE; break;
                case "UNICODE_CASE": flag = Pattern.UNICODE_CASE; break;
                case "UNIX_LINES": flag = Pattern.UNIX_LINES; break;
            }
        }

        Pattern p;
        if (flag == -1) p = Pattern.compile(args[1]);
        else p = Pattern.compile(args[1], flag);

        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}
