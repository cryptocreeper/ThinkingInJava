package chapter11_collections.task27;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void performAllOperations(Queue<Command> commands) {
        for (Command command : commands) command.operation();
    }

    public static void main(String[] args) {
        Queue<Command> commands = new LinkedList<>();
        Filler.fillQueue(commands);
        performAllOperations(commands);
    }
}
