package chapter11_collections.task32;

import java.util.Random;

public class Persons {
    private static String[] names = {"John", "Jack", "Kurt", "Kate", "Donald", "Melony", "Irma", "Paul", "Diego" };

    public static Person[] createArray(int count) {
        Person[] persons = new Person[count];
        Random random = new Random();
        for (int i = 0; i < count; i++)
            persons[i] = new Person(names[random.nextInt(names.length - 1)]);
        return persons;
    }
}
