package chapter11_collections.task04;

import java.util.ArrayList;

public class HeroNameGenerator {

    private ArrayList<String> heroesNames = new ArrayList<>();
    private int i = 0;

    public HeroNameGenerator() {
        heroesNames.add("Batman");
        heroesNames.add("Robin");
        heroesNames.add("Joker");
        heroesNames.add("Harley");
    }

    public String next() {
        String heroName = heroesNames.get(i++);
        if (i == heroesNames.size()) i = 0;
        return heroName;
    }

}