package chapter11_collections.task32;

public class Main {
    public static void main(String[] args) {
        NonCollectionSequence sequence = new NonCollectionSequence();
        for (Person person : sequence) System.out.print(person + " ");
        System.out.println();
        for (Person person : sequence.reversed()) System.out.print(person + " ");
        System.out.println();
        for (Person person : sequence.randomized()) System.out.print(person + " ");
    }
}
