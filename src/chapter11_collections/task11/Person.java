package chapter11_collections.task11;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
