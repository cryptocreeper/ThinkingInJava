package chapter12.task21;

public class Main {
    public static void main(String[] args) {
        try {
            Dog animal = new Dog();
        } catch (AnimalConstructionException e) {
            System.out.println("Animal construction exception");
        }
    }
}
