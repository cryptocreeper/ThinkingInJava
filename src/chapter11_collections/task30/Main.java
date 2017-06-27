package chapter11_collections.task30;

public class Main {
    public static void main(String[] args) {
        CollectionSequence sequence = new CollectionSequence();
        InterfaceVsIterator.display(sequence);
        InterfaceVsIterator.display(sequence.iterator());
    }
}
