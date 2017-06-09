package chapter11_collections.task06;

import chapter11_collections.task05.IntegerFeatures;

import java.util.*;

public class StringFeatures {
    public static void main(String[] args) {
        List<String> strings = StringFeatures.arrayList(7);
        System.out.println("1: " + strings);

        String s = "Гилберт";
        strings.add(s);
        System.out.println("2: " + strings);

        System.out.println("3: " + strings.contains(s));

        strings.remove(s);
        String t = strings.get(2);
        System.out.println("4: " + t + " " + strings.indexOf(t));

        String k = "Мартин";
        System.out.println("5: " + strings.indexOf(k));

        System.out.println("6: " + strings.remove(k));

        System.out.println("7: " + strings.remove(t));

        System.out.println("8: " + strings);

        strings.add(3, "Гарри");
        System.out.println("9: " + strings);

        List<String> sub = strings.subList(1, 4);
        System.out.println("Частичный список: " + sub);

        System.out.println("10: " + strings.containsAll(sub));

        Collections.sort(sub);
        System.out.println("После сортирвоки: " + sub);

        System.out.println("11: " + strings.containsAll(sub));

        Random random = new Random(47);
        Collections.shuffle(sub, random);
        System.out.println("После перемешивания: " + sub);

        System.out.println("12: " + strings.containsAll(sub));

        List<String> copy = new ArrayList<>(strings);
        sub = Arrays.asList(strings.get(1), strings.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<>(strings);
        copy.remove(2);
        System.out.println("14: " + copy);

        copy.removeAll(sub);
        System.out.println("15: " + copy);

        copy.set(1, "Джек");
        System.out.println("16: " + copy);

        copy.addAll(2, sub);
        System.out.println("17: " + copy);

        System.out.println("18: " + strings.isEmpty());

        strings.clear();
        System.out.println("19: " + strings);

        System.out.println("20: " + strings.isEmpty());

        strings.addAll(StringFeatures.arrayList(4));
        System.out.println("21: " + strings);

        Object[] o = strings.toArray();
        System.out.println("22: " + o[3]);

        String[] ia = strings.toArray(new String[0]);
        System.out.println("23: " + ia[3]);
    }

    static ArrayList<String> arrayList(int count) {
        ArrayList<String> stringsCollection = new ArrayList<>();
        Collections.addAll(stringsCollection, "Павел", "Михаил", "Александр", "Антон", "Сергей", "Василий", "Олег",
                "Илья", "Максим", "Артур", "Георгий");

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = (int) (Math.random() * stringsCollection.size());
            arrayList.add(stringsCollection.get(randomIndex));
        }
        return arrayList;
    }
}
