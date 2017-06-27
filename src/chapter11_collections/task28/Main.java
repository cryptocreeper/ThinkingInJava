package chapter11_collections.task28;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            doubles.add(random.nextDouble());
        }

        while (!doubles.isEmpty()) System.out.println(doubles.poll());
    }
}
