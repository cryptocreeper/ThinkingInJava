package chapter13_strings.task01;

public class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
