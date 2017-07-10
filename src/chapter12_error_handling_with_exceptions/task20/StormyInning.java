package chapter12.task20;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseballException, RainedOutException {}
    public StormyInning(String s) throws BaseballException, FoulException {}

    //public void walk() throws PopFoulException {}
    //public void event() throws RainedOutException {}
    public void rainHard() throws RainedOutException {}
    public void event() {}
    public void atBat() throws PopFoulException {}
    public void umpire() {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.umpire();
        } catch (PopFoulException e) {
            System.out.println("Pop foul");
        } catch (RainedOutException e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Baseball");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
            i.umpire();
        } catch (StrikeException e) {
            System.out.println("Strike");
        } catch (FoulException e) {
            System.out.println("Foul");
        } catch (RainedOutException e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Baseball");
        } catch (UmpireException e) {
            e.printStackTrace();
        }
    }
}
