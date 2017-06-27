package chapter11_collections.task29;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Person> persons = new PriorityQueue<>();
        // ClassCastException: Person cannot be cast to java.lang.Comparable
        // persons.add(new Person());
    }
}