package chapter13_strings.task01;

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("valve1 = ").append(valve1).append(" ");
        stringBuilder.append("valve2 = ").append(valve2).append(" ");
        stringBuilder.append("valve3 = ").append(valve3).append(" ");
        stringBuilder.append("valve4 = ").append(valve4).append('\n');
        stringBuilder.append("i = ").append(i).append(" ");
        stringBuilder.append("f = ").append(f).append(" ");
        stringBuilder.append("source = ").append(source);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
