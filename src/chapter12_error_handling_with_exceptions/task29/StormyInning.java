package chapter12.task29;

public class StormyInning extends Inning implements Storm {
    public StormyInning() {}
    public StormyInning(String s) {}

    public void walk() {}
    public void rainHard()  {}
    public void event() {}
    public void atBat()  {}

    public static void main(String[] args) {
        StormyInning si = new StormyInning();
        si.atBat();

        Inning i = new StormyInning();
        i.atBat();
    }
}
