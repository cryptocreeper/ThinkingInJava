package chapter11_collections.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        Collections.addAll(rodents, new Rodent(), new Hamster(), new Mouse(), new Hamster(), new Rodent());

        Iterator<Rodent> iterator = rodents.iterator();
        while (iterator.hasNext()) {
            Rodent rodent = iterator.next();
            rodent.run();
            rodent.eat();
        }
    }
}
