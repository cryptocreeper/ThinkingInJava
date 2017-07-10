package chapter12.task20;

public abstract class Inning {
    public Inning() throws BaseballException {}
    public Inning(String s) {}

    public void event() throws BaseballException {}
    public abstract void atBat() throws StrikeException, FoulException;
    public void walk() {}
    public void umpire() throws UmpireException {}
}
