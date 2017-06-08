package chapter11_collections.task04;

public class Main {
    public static void main(String[] args) {
        HeroNameGenerator generator = new HeroNameGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}