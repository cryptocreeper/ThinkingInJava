package chapter11_collections.task30;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence implements Collection<Person> {
    private Person[] persons = Persons.createArray(10);
    private int index = persons.length;

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean contains(Object o) {
        Person person = (Person) o;
        for (int i = 0; i < persons.length; i++) {
            if (person == persons[i]) return true;
        }
        return false;
    }

    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            private int iteratorIndex = 0;

            @Override
            public boolean hasNext() {
                return iteratorIndex < index;
            }

            @Override
            public Person next() {
                return persons[iteratorIndex++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(persons, persons.length);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < persons.length)
            return (T[]) Arrays.copyOf(persons, persons.length, a.getClass());
        System.arraycopy(persons, 0, a, 0, persons.length);
        if (a.length > persons.length)
            a[persons.length] = null;
        return a;
    }

    @Override
    public boolean add(Person person) {
        if (persons.length == index) return false;
        persons[index++] = person;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == o) {
                for (int j = i; j < persons.length - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            if (!contains(iterator.next())) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        if (c.size() + index >= persons.length) return false;
        else {
            Iterator<? extends Person> iterator = c.iterator();
            while (iterator.hasNext()) persons[index++] = iterator.next();
            return true;
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean isDone = false;
        Iterator iterator = c.iterator();
        while (iterator.hasNext())
            isDone = isDone || remove(iterator.next());
        return isDone;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean isDone = false;
        for (int i = 0; i < persons.length; i++) {
            if (!c.contains(persons[i])) {
                isDone = isDone || remove(persons[i]);
                i--;
            }
        }
        return isDone;
    }

    @Override
    public void clear() {
        index = 0;
    }
}
