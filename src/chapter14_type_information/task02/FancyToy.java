package chapter14_type_information.task02;

public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Speaking {
    FancyToy() {
        super(1);
    }
}
