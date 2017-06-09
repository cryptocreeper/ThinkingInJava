package chapter11_collections.task05;

import java.util.*;

public class IntegerFeatures {
    public static void main(String[] args) {
        List<Integer> integers = IntegerFeatures.arrayList(7);
        System.out.println("1: " + integers);

        Integer i = 20;
        integers.add(i);
        System.out.println("2: " + integers);

        System.out.println("3: " + integers.contains(i));

        integers.remove(i);
        Integer j = integers.get(2);
        System.out.println("4: " + j + " " + integers.indexOf(j));

        Integer k = 30;
        System.out.println("5: " + integers.indexOf(k));

        System.out.println("6: " + integers.remove(k));

        System.out.println("7: " + integers.remove(j));

        System.out.println("8: " + integers);

        integers.add(3, 40);
        System.out.println("9: " + integers);

        List<Integer> sub = integers.subList(1, 4);
        System.out.println("Частичный список: " + sub);

        System.out.println("10: " + integers.containsAll(sub));

        Collections.sort(sub);
        System.out.println("После сортирвоки: " + sub);

        System.out.println("11: " + integers.containsAll(sub));

        Random random = new Random(47);
        Collections.shuffle(sub, random);
        System.out.println("После перемешивания: " + sub);

        System.out.println("12: " + integers.containsAll(sub));

        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println("14: " + copy);

        copy.removeAll(sub);
        System.out.println("15: " + copy);

        copy.set(1, 50);
        System.out.println("16: " + copy);

        copy.addAll(2, sub);
        System.out.println("17: " + copy);

        System.out.println("18: " + integers.isEmpty());

        integers.clear();
        System.out.println("19: " + integers);

        System.out.println("20: " + integers.isEmpty());

        integers.addAll(IntegerFeatures.arrayList(4));
        System.out.println("21: " + integers);

        Object[] o = integers.toArray();
        System.out.println("22: " + o[3]);

        Integer[] ia = integers.toArray(new Integer[0]);
        System.out.println("23: " + ia[3]);
    }

    static ArrayList<Integer> arrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++)
            arrayList.add((int)(Math.random() * 10));
        return arrayList;
    }
}
