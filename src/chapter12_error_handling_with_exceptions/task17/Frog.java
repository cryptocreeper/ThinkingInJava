package chapter12_error_handling_with_exceptions.task17;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = null;
        try {
            frog = new Frog();
            System.out.println("Bye!");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            frog.dispose();
        }
    }
}
