package chapter11_collections.task32;

import java.util.*;

public class NonCollectionSequence extends PersonSequence implements Iterable<Person> {
    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < persons.length;
            }

            @Override
            public Person next() {
                return persons[index++];
            }
        };
    }

    public Iterable<Person> reversed() {
        return new Iterable<Person>() {
            @Override
            public Iterator<Person> iterator() {
                return new Iterator<Person>() {
                    int current = persons.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Person next() {
                        return persons[current--];
                    }
                };
            }
        };
    }

    public Iterable<Person> randomized() {
        return new Iterable<Person>() {
            @Override
            public Iterator<Person> iterator() {
                List<Person> shuffled = new ArrayList<>(Arrays.asList(persons));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
}
