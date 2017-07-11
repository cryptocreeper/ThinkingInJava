package chapter13_strings.task05;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        formatter.format("%3$+-5d degrees\n", -4, 2, -7);
        formatter.format("%2$-5c is the first letter: \n", 'b', 'a');
        formatter.format("%2$-5b story!\n", false, true);
        formatter.format("It is a %2$-10.10s String\n", "cool", "foolish", "bad");
        formatter.format("%3$+-5.5f is the Euler's number\n", 12.3, Math.PI, Math.E);
        formatter.format("%2$+-2.10e is a some number\n", Math.PI, -12567543.3855, Math.E);
        formatter.format("%2$-5x is a hex number\n", -4, 221, -7);
        formatter.format("%2$-5h is a hash code\n", -4, "hello", -7);
        formatter.format("100%% complete!");
    }
}
