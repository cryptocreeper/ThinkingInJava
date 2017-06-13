package chapter11_collections.task08;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(5));
        gerbils.add(new Gerbil(8));
        gerbils.add(new Gerbil(11));

        Iterator<Gerbil> iterator = gerbils.iterator();

        while (iterator.hasNext())
            iterator.next().hop();
    }

}
