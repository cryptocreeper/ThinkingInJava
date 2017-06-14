package chapter11_collections.task13;

import java.util.*;

public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while(eventList.size() > 0) {
            Iterator<Event> iterator = new LinkedList<>(eventList).iterator();
            while (iterator.hasNext()) {
                Event event = iterator.next();
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
