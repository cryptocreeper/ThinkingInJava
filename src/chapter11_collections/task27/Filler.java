package chapter11_collections.task27;

import java.util.Queue;

public class Filler {
    public static void fillQueue(Queue<Command> commands) {
        commands.add(new Command("left"));
        commands.add(new Command("right"));
        commands.add(new Command("up"));
        commands.add(new Command("down"));
        System.out.println(commands);
    }
}
