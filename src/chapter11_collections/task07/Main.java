package chapter11_collections.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] personsArray = { new Person("Василий", 21), new Person("Антон", 28), new Person("Андрей", 16),
            new Person("Семен", 45), new Person("Даниил", 35) };
        List<Person> personsList = new ArrayList<>(Arrays.asList(personsArray));
        List<Person> personsSublist = personsList.subList(1, 3);
        personsList.removeAll(personsSublist);
        System.out.println(personsList);
    }
}
