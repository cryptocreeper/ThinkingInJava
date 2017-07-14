package chapter13_strings.task16;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Program arguments for example:
// ./src/chapter13_strings/task16 \b[Ssct]\w+

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        Pattern p = Pattern.compile(args[1]);

        File[] files = new File(args[0]).listFiles();

        for (File file : files) {
            int index = 0;
            Matcher m = p.matcher("");
            for (String line : new TextFile(file.getPath())) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
