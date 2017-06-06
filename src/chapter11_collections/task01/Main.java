package chapter11_collections.task01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(5));
        gerbils.add(new Gerbil(8));
        gerbils.add(new Gerbil(11));

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }

    }

}
